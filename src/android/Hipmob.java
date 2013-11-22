package com.hipmob.android.phonegap.plugin;

import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import com.hipmob.android.HipmobCore;

public class Hipmob extends CordovaPlugin 
{
    @Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException
    {
	PluginResult result = null;
	if("openChat".equals(action)){
	    try{
		Intent i = new Intent(cordova.getActivity(), HipmobCore.class);
		i.putExtra(HipmobCore.KEY_APPID, args.get(0).toString());
		i.putExtra(HipmobCore.KEY_TITLE, args.get(1).toString());
		cordova.getActivity().startActivity(i);			    
		callbackContext.sendPluginResult(new PluginResult(Status.OK));
	    }catch(Exception e1){
		callbackContext.sendPluginResult(new PluginResult(Status.ERROR, "Missing app id or title"));
	    }
	    return true;
	}
	return false;
    }
}
