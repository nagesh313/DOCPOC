angular.module("myApp").directive('fileModel', ['$parse', function ($parse) {
    return {
        restrict: 'A',
        link: function (scope, element, attrs) {
            var model = $parse(attrs.fileModel);
            var modelSetter = model.assign;

            element.bind('change', function () {
                scope.$apply(function () {
                    if (element[0].files[0].type != 'image/png') {
                        element[0].value = '';
                        element[0].files[0] = '';
                        scope.myFile = '';

                        //alert();
                        return;
                    } else {

                        modelSetter(scope, element[0].files[0]);
                    }
                });
            });
        }
    };
}])
  .directive('loadingStatusMessage', function () {
    return {
      link: function ($scope, $element, attrs) {
        var show = function () {
          $element.css('display', 'block');
          $element.css('background-color', 'black');
          $element.css('opacity', '0.5');
          //  
        };
        var hide = function () {
          $element.css('display', 'none');
          
        };
        $scope.$on('loadingStatusActive', show);
        $scope.$on('loadingStatusInactive', hide);
        show();
      }
    };
  }).factory('loadingStatusInterceptor', function ($q, $rootScope) {
	  $rootScope.activeRequests = 0;
    var started = function () {
      if ($rootScope.activeRequests == 0) {
        $rootScope.$broadcast('loadingStatusActive');
      }
      $rootScope.activeRequests++;
    };
    var ended = function () {
    	$rootScope.activeRequests--;
      if ($rootScope.activeRequests == 0) {
        $rootScope.$broadcast('loadingStatusInactive');
      }
    };
    return {
      request: function (config) {
        started();
        return config || $q.when(config);
      },
      response: function (response) {
        ended();
        return response || $q.when(response);
      },
      responseError: function (rejection) {
        ended();
        return $q.reject(rejection);
      }
    };
  });