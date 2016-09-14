package com.yywh.buddhist.http.pojo;

import java.util.List;

public class RabbiData {


    /**
     * ma_id : 1
     * ma_tpid : 6
     * ma_name : 自觉法师
     * ma_time : 1471508484
     * ma_desc : 释自觉简介俗名：贺步荣，法名：自觉，甘肃平凉人，号“痴道人”、“渔樵夫”、“寒林老叟”。中国佛学院毕业，进修于中国美术学院山水画系，硕士学历。自幼酷爱佛法，谨仰沙门，皈依一代高僧清定上师，剃度出家，修学密藏，后依止根通大和尚修学禅宗要旨。现任山西省五台山福圣寺住持、任浙江省宁波金莲禅寺住持，创办上海一溪云净舍。
     * ma_logo : http://wx.yywhsh.com/assets/admin/uploads/2016072217904529.png
     * ma_statu : 2
     */

    private List<MasterBean> master;
    /**
     * ma_id : 1
     * ma_tpid : 6
     * ma_name : 自觉法师
     * ma_time : 1471508484
     * ma_desc : 释自觉简介俗名：贺步荣，法名：自觉，甘肃平凉人，号“痴道人”、“渔樵夫”、“寒林老叟”。中国佛学院毕业，进修于中国美术学院山水画系，硕士学历。自幼酷爱佛法，谨仰沙门，皈依一代高僧清定上师，剃度出家，修学密藏，后依止根通大和尚修学禅宗要旨。现任山西省五台山福圣寺住持、任浙江省宁波金莲禅寺住持，创办上海一溪云净舍。
     * ma_logo : http://wx.yywhsh.com/assets/admin/uploads/2016072217904529.png
     * ma_statu : 2
     * raiseList : {"tp_id":"6","tp_name":"金莲禅寺","tp_desc":"金莲禅寺位于宁波市鄞州区古林镇共任村 ","tp_time":"1469597284","tp_tel":"18049938489","tp_email":"why@yywhsh.com","tp_addres":"金莲禅寺","tp_banner":null,"tp_logo":"http://wx.yywhsh.com/assets/admin/uploads/2016072216239436.gif","tp_staut":"2","tp_coordinate":"121.459607,29.820552","tp_profile":"坐落于宁波市鄞州市","tp_provinces":"31","tp_citys":"388","tp_countrys":"3284","tp_contacts":null,"tp_morien":null}
     */

    private List<MastersRedBean> masters_red;
    /**
     * ba_id : 1
     * ba_type : 2
     * ba_url : http://wx.yywhsh.com/master/details?mid=1
     * ba_staut : 1
     * ba_title : 11112
     * ba_time : 1469593292
     * ba_logo : http://wx.yywhsh.com/assets/admin/uploads/2016072712114444.jpg
     */

    private List<BannersBean> banners;

    public List<MasterBean> getMaster() {
        return master;
    }

    public void setMaster(List<MasterBean> master) {
        this.master = master;
    }

    public List<MastersRedBean> getMasters_red() {
        return masters_red;
    }

    public void setMasters_red(List<MastersRedBean> masters_red) {
        this.masters_red = masters_red;
    }

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public static class MasterBean {
        private String ma_id;
        private String ma_tpid;
        private String ma_name;
        private String ma_time;
        private String ma_desc;
        private String ma_logo;
        private String ma_statu;

        public String getMa_id() {
            return ma_id;
        }

        public void setMa_id(String ma_id) {
            this.ma_id = ma_id;
        }

        public String getMa_tpid() {
            return ma_tpid;
        }

        public void setMa_tpid(String ma_tpid) {
            this.ma_tpid = ma_tpid;
        }

        public String getMa_name() {
            return ma_name;
        }

        public void setMa_name(String ma_name) {
            this.ma_name = ma_name;
        }

        public String getMa_time() {
            return ma_time;
        }

        public void setMa_time(String ma_time) {
            this.ma_time = ma_time;
        }

        public String getMa_desc() {
            return ma_desc;
        }

        public void setMa_desc(String ma_desc) {
            this.ma_desc = ma_desc;
        }

        public String getMa_logo() {
            return ma_logo;
        }

        public void setMa_logo(String ma_logo) {
            this.ma_logo = ma_logo;
        }

        public String getMa_statu() {
            return ma_statu;
        }

        public void setMa_statu(String ma_statu) {
            this.ma_statu = ma_statu;
        }
    }

    public static class MastersRedBean {
        private String ma_id;
        private String ma_tpid;
        private String ma_name;
        private String ma_time;
        private String ma_desc;
        private String ma_logo;
        private String ma_statu;
        /**
         * tp_id : 6
         * tp_name : 金莲禅寺
         * tp_desc : 金莲禅寺位于宁波市鄞州区古林镇共任村
         * tp_time : 1469597284
         * tp_tel : 18049938489
         * tp_email : why@yywhsh.com
         * tp_addres : 金莲禅寺
         * tp_banner : null
         * tp_logo : http://wx.yywhsh.com/assets/admin/uploads/2016072216239436.gif
         * tp_staut : 2
         * tp_coordinate : 121.459607,29.820552
         * tp_profile : 坐落于宁波市鄞州市
         * tp_provinces : 31
         * tp_citys : 388
         * tp_countrys : 3284
         * tp_contacts : null
         * tp_morien : null
         */

        private RaiseListBean raiseList;

        public String getMa_id() {
            return ma_id;
        }

        public void setMa_id(String ma_id) {
            this.ma_id = ma_id;
        }

        public String getMa_tpid() {
            return ma_tpid;
        }

        public void setMa_tpid(String ma_tpid) {
            this.ma_tpid = ma_tpid;
        }

        public String getMa_name() {
            return ma_name;
        }

        public void setMa_name(String ma_name) {
            this.ma_name = ma_name;
        }

        public String getMa_time() {
            return ma_time;
        }

        public void setMa_time(String ma_time) {
            this.ma_time = ma_time;
        }

        public String getMa_desc() {
            return ma_desc;
        }

        public void setMa_desc(String ma_desc) {
            this.ma_desc = ma_desc;
        }

        public String getMa_logo() {
            return ma_logo;
        }

        public void setMa_logo(String ma_logo) {
            this.ma_logo = ma_logo;
        }

        public String getMa_statu() {
            return ma_statu;
        }

        public void setMa_statu(String ma_statu) {
            this.ma_statu = ma_statu;
        }

        public RaiseListBean getRaiseList() {
            return raiseList;
        }

        public void setRaiseList(RaiseListBean raiseList) {
            this.raiseList = raiseList;
        }

        public static class RaiseListBean {
            private String tp_id;
            private String tp_name;
            private String tp_desc;
            private String tp_time;
            private String tp_tel;
            private String tp_email;
            private String tp_addres;
            private Object tp_banner;
            private String tp_logo;
            private String tp_staut;
            private String tp_coordinate;
            private String tp_profile;
            private String tp_provinces;
            private String tp_citys;
            private String tp_countrys;
            private Object tp_contacts;
            private Object tp_morien;

            public String getTp_id() {
                return tp_id;
            }

            public void setTp_id(String tp_id) {
                this.tp_id = tp_id;
            }

            public String getTp_name() {
                return tp_name;
            }

            public void setTp_name(String tp_name) {
                this.tp_name = tp_name;
            }

            public String getTp_desc() {
                return tp_desc;
            }

            public void setTp_desc(String tp_desc) {
                this.tp_desc = tp_desc;
            }

            public String getTp_time() {
                return tp_time;
            }

            public void setTp_time(String tp_time) {
                this.tp_time = tp_time;
            }

            public String getTp_tel() {
                return tp_tel;
            }

            public void setTp_tel(String tp_tel) {
                this.tp_tel = tp_tel;
            }

            public String getTp_email() {
                return tp_email;
            }

            public void setTp_email(String tp_email) {
                this.tp_email = tp_email;
            }

            public String getTp_addres() {
                return tp_addres;
            }

            public void setTp_addres(String tp_addres) {
                this.tp_addres = tp_addres;
            }

            public Object getTp_banner() {
                return tp_banner;
            }

            public void setTp_banner(Object tp_banner) {
                this.tp_banner = tp_banner;
            }

            public String getTp_logo() {
                return tp_logo;
            }

            public void setTp_logo(String tp_logo) {
                this.tp_logo = tp_logo;
            }

            public String getTp_staut() {
                return tp_staut;
            }

            public void setTp_staut(String tp_staut) {
                this.tp_staut = tp_staut;
            }

            public String getTp_coordinate() {
                return tp_coordinate;
            }

            public void setTp_coordinate(String tp_coordinate) {
                this.tp_coordinate = tp_coordinate;
            }

            public String getTp_profile() {
                return tp_profile;
            }

            public void setTp_profile(String tp_profile) {
                this.tp_profile = tp_profile;
            }

            public String getTp_provinces() {
                return tp_provinces;
            }

            public void setTp_provinces(String tp_provinces) {
                this.tp_provinces = tp_provinces;
            }

            public String getTp_citys() {
                return tp_citys;
            }

            public void setTp_citys(String tp_citys) {
                this.tp_citys = tp_citys;
            }

            public String getTp_countrys() {
                return tp_countrys;
            }

            public void setTp_countrys(String tp_countrys) {
                this.tp_countrys = tp_countrys;
            }

            public Object getTp_contacts() {
                return tp_contacts;
            }

            public void setTp_contacts(Object tp_contacts) {
                this.tp_contacts = tp_contacts;
            }

            public Object getTp_morien() {
                return tp_morien;
            }

            public void setTp_morien(Object tp_morien) {
                this.tp_morien = tp_morien;
            }
        }
    }

    public static class BannersBean {
        private String ba_id;
        private String ba_type;
        private String ba_url;
        private String ba_staut;
        private String ba_title;
        private String ba_time;
        private String ba_logo;

        public String getBa_id() {
            return ba_id;
        }

        public void setBa_id(String ba_id) {
            this.ba_id = ba_id;
        }

        public String getBa_type() {
            return ba_type;
        }

        public void setBa_type(String ba_type) {
            this.ba_type = ba_type;
        }

        public String getBa_url() {
            return ba_url;
        }

        public void setBa_url(String ba_url) {
            this.ba_url = ba_url;
        }

        public String getBa_staut() {
            return ba_staut;
        }

        public void setBa_staut(String ba_staut) {
            this.ba_staut = ba_staut;
        }

        public String getBa_title() {
            return ba_title;
        }

        public void setBa_title(String ba_title) {
            this.ba_title = ba_title;
        }

        public String getBa_time() {
            return ba_time;
        }

        public void setBa_time(String ba_time) {
            this.ba_time = ba_time;
        }

        public String getBa_logo() {
            return ba_logo;
        }

        public void setBa_logo(String ba_logo) {
            this.ba_logo = ba_logo;
        }
    }
}
