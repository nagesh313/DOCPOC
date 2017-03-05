angular.module("myApp").controller('PatientCtrl', ['$scope','PatientService', function ($scope,PatientService) {

        $scope.intializeUploadImage = function () {
            console.log("inside")
            var input = document.querySelector('.uploadProfilePicBtn');
            input.addEventListener('change', function () {
                var file = input.files[0];
                drawOnCanvas(file);
            });
            function drawOnCanvas(file) {
                // We use the File APi to read the content of the input file element
                var reader = new FileReader();
                // On reader load with parse the content and draw it on Canvas
                reader.onload = function (e) {
                    var dataURL = e.target.result,
                        c = document.querySelector('canvas'),
                        ctx = c.getContext('2d'),
                        img = new Image();
                    img.onload = function () {
                        c.width = img.width;
                        c.height = img.height;
                        ctx.drawImage(img, 0, 0);
                    };
                    img.src = dataURL;
                };
                // Load the file in reader ...
                reader.readAsDataURL(file);
            }
            $scope.userMedia=function() {
                return navigator.getUserMedia = navigator.getUserMedia ||
                    navigator.webkitGetUserMedia ||
                    navigator.mozGetUserMedia ||
                    navigator.msGetUserMedia || null;
            };
            // Now we can use it
            if ($scope.userMedia()) {
                $scope.videoPlaying = false;
                var constraints = {
                    video: true,
                    audio: false
                };
                var video = document.getElementById('v');
                var media = navigator.getUserMedia(constraints, function (stream) {
                    // URL Object is different in WebKit
                    var url = window.URL || window.webkitURL;
                    // create the url and set the source of the video element
                    video.src = url ? url.createObjectURL(stream) : stream;
                    // Start the video
                    video.play();
                    $scope.videoPlaying = true;
                }, function (error) {
                    console.log("ERROR");
                    console.log(error);
                });
                $scope.takePicture = function () {
                    if (videoPlaying) {
                        var canvas = document.getElementById('canvas');
                        canvas.width = video.videoWidth;
                        canvas.height = video.videoHeight;
                        canvas.getContext('2d').drawImage(video, 0, 0);
                        var data = canvas.toDataURL('image/webp');
                        document.getElementById('photo').setAttribute('src', data);
                    }
                    else {
                        console.log("KO");
                    }
                };
            }
        }
    }]);
