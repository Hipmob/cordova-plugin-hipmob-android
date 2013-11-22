cordova-plugin-hipmob-android
---------------------------
The Hipmob Cordova plugin for Android provides Phonegap applications access to helpdesk, live chat and support CRM tools using the Hipmob platform. For more information visit https://www.hipmob.com.

It is compatible with Android 2.1 and higher, and works on versions of Cordova greater than 2.9.0.

Installation
---------------------------
Install the plugin using the Cordova command-line interface:

cordova plugin add https://github.com/hipmob/cordova-plugin-hipmob-android.git

Usage
---------------------------
To use the Hipmob library, you'll need to get a free account at https://www.hipmob.com/. Once you have an account, visit https://manage.hipmob.com/#apps to get your application ID. You can then open a support chat window from a button:

    if( window.plugins && window.plugins.Hipmob ) {
        var hipmob_app_id = '<HIPMOB APPLICATION ID>';
        var Hipmob = window.plugins.Hipmob;
    
        Hipmob.openChat(hipmob_app_id);
    } else {
      alert('Hipmob plugin not available/ready.');
    }
    