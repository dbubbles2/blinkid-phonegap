package com.phonegap.plugins.microblink.recognizers;

import com.microblink.entities.recognizers.blinkid.mrtd.MRZResult;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class BlinkIDSerializationUtils {
    public static JSONObject serializeMRZResult(MRZResult mrzResult) throws JSONException {
        JSONObject jsonMrz = new JSONObject();
        jsonMrz.put("documentType", mrzResult.getDocumentType().ordinal() + 1);
        jsonMrz.put("primaryId", mrzResult.getPrimaryId());
        jsonMrz.put("secondaryId", mrzResult.getSecondaryId());
        jsonMrz.put("issuer", mrzResult.getIssuer());
        jsonMrz.put("dateOfBirth", SerializationUtils.serializeDate(mrzResult.getDateOfBirth().getDate()));
        jsonMrz.put("documentNumber", mrzResult.getDocumentNumber());
        jsonMrz.put("nationality", mrzResult.getNationality());
        jsonMrz.put("gender", mrzResult.getGender());
        jsonMrz.put("documentCode", mrzResult.getDocumentCode());
        jsonMrz.put("dateOfExpiry", SerializationUtils.serializeDate(mrzResult.getDateOfExpiry().getDate()));
        jsonMrz.put("opt1", mrzResult.getOpt1());
        jsonMrz.put("opt2", mrzResult.getOpt2());
        jsonMrz.put("alienNumber", mrzResult.getAlienNumber());
        jsonMrz.put("applicationReceiptNumber", mrzResult.getApplicationReceiptNumber());
        jsonMrz.put("immigrantCaseNumber", mrzResult.getImmigrantCaseNumber());
        jsonMrz.put("mrzText", mrzResult.getMRZText());
        jsonMrz.put("mrzParsed", mrzResult.isMRZParsed());
        jsonMrz.put("mrzVerified", mrzResult.isMRZVerified());
        return jsonMrz;

    }
}
