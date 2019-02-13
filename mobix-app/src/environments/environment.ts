// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.

export const environment = {
  production: false,
  apiConfiguartionFile: 'assets/api-config.json',
  firebase: {
    apiKey: 'AIzaSyC-wT1wBAkHsOxzqDvBqsSVevCleEmnimM',
    authDomain: 'mobix.firebaseapp.com',
    databaseURL: 'https://mobix.firebaseio.com',
    projectId: 'mobix',
    storageBucket: '',
    messagingSenderId: '28808179409'
  }
};
