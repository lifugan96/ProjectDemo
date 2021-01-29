package com.glf.rxjavademo.model.domain;

public class ShoppingUserInfo {


    /**
     * code : 1
     * data : {"account":"glf","familyId":1,"gmtCreate":"2019-04-25","gmtModified":"2020-01-03","id":1,"name":"glf","type":"1"}
     * msg : 成功
     */

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * account : glf
         * familyId : 1
         * gmtCreate : 2019-04-25
         * gmtModified : 2020-01-03
         * id : 1
         * name : glf
         * type : 1
         */

        private String account;
        private int familyId;
        private String gmtCreate;
        private String gmtModified;
        private int id;
        private String name;
        private String type;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public int getFamilyId() {
            return familyId;
        }

        public void setFamilyId(int familyId) {
            this.familyId = familyId;
        }

        public String getGmtCreate() {
            return gmtCreate;
        }

        public void setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        public String getGmtModified() {
            return gmtModified;
        }

        public void setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
