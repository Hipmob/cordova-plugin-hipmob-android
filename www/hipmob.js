/**
 * @fileOverview The Hipmob Phonegap Android plugin implementation: provides helpdesk search and live chat using the Hipmob support and CRM system. For more information see https://www.hipmob.com/.
 *
 * @author <a href="mailto:femi@hipmob.com">Femi Omojola</a>
 * @version 0.1.0
 * @name Hipmob
 * @copyright 2013 Orthogonal Labs, Inc.
 */
var exec = cordova.require('cordova/exec');

var openChat = function(appid, options, success, failure){
    var default_options = {
	'title': 'Support Chat'
    };
    var args = [appid];
    if('title' in options) args.push(options['title']);
    else args.push(default_options['title']);
    exec(success, failure, 'Hipmob', 'openChat', args);
};

module.exports = {
    openChat: openChat
};
