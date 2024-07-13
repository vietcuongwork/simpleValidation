package com.vietcuong.simpleValidation.common;

public class ResponseStatus {

    public static enum GlobalError {
        CLIENT_REGISTRATION_SUCCESS("00", "CLIENT_REGISTRATION_SUCCESS"),
        CLIENT_REGISTRATION_ERROR("01", "CLIENT_REGISTRATION_ERROR");

        private final String code;
        private final String description;

        GlobalError(String code, String description) {
            this.code = code;
            this.description = description;
        }

        public String getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }
    }
}
