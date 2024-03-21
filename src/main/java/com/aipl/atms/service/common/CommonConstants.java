package com.aipl.atms.service.common;

public class CommonConstants {
    public static final String STRING = "string";
    public static final String HEADER = "header";

    // header Parameters
    public static final String HEADER_PRAM_CREATION_DATETIME = "aipl-creationTimeStamp";
    public static final String HEADER_PRAM_APPLICATION_ID = "aipl-applicationId";
    public static final String HEADER_PRAM_INTERACTION_ID = "aipl-interactionId";
    public static final String HEADER_PRAM_MESSAGE_ID = "aipl-messageId";
    public static final String HEADER_PRAM_ACTOR_ID = "aipl-applicationId";

    // PRODUCE & Consumer contracts
    public static final String API_PRODUCER_MEDIA_TYPE = "application/aspl.crm.contract-response.json";
    public static final String API_CONSUMER_MEDIA_TYPE = "application/aspl.crm.contract-request.json";


    // *** ------------ ** ATMS *** ------------ ** \\

    public CommonConstants() {
    }
}
