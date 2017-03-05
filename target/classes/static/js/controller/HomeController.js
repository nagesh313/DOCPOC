angular.module("myApp").controller('HomeController', function($scope, $timeout, $mdBottomSheet, $mdToast) {
  // $scope.alert = '';

  // $scope.showListBottomSheet = function() {
  //   // $scope.alert = '';
  //   $mdBottomSheet.show({
  //     templateUrl: 'bottom-sheet-list-template.html',
  //     controller: 'ListBottomSheetCtrl',
  //     clickOutsideToClose: true
  //   }).then(function(clickedItem) {
  //     $scope.alert = clickedItem['name'] + ' clicked!';
  //   });
  // };

  $scope.showGridBottomSheet = function() {
    $scope.alert = '';
    $mdBottomSheet.show({
      templateUrl: 'views/templates/bottom-sheet-list-template.html',
      controller: 'GridBottomSheetCtrl',
    }).then(function(clickedItem) {
      $mdToast.show(
            $mdToast.simple()
              .textContent(clickedItem['name'] + ' clicked!')
              .position('top right')
              .hideDelay(1500)
          );
    });
  };
})

.controller('GridBottomSheetCtrl', function($scope, $mdBottomSheet) {

   $scope.items = [
    { name: 'Hangout', icon: 'hangout' },
    { name: 'Mail', icon: 'mail' },
    { name: 'Message', icon: 'message' },
    { name: 'Copy', icon: 'copy2' },
    { name: 'Facebook', icon: 'facebook' },
    { name: 'Twitter', icon: 'twitter' },
  ];

  $scope.listItemClick = function($index) {
    var clickedItem = $scope.items[$index];
    $mdBottomSheet.hide(clickedItem);
  };
});
// .controller('GridBottomSheetCtrl', function($scope, $mdBottomSheet) {
//   $scope.items = [
//     { name: 'Hangout', icon: 'hangout' },
//     { name: 'Mail', icon: 'mail' },
//     { name: 'Message', icon: 'message' },
//     { name: 'Copy', icon: 'copy2' },
//     { name: 'Facebook', icon: 'facebook' },
//     { name: 'Twitter', icon: 'twitter' },
//   ];

//   $scope.listItemClick = function($index) {
//     var clickedItem = $scope.items[$index];
//     $mdBottomSheet.hide(clickedItem);
//   };
// })