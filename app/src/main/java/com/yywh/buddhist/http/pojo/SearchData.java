package com.yywh.buddhist.http.pojo;

import java.util.List;

public class SearchData {


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
     * templePro : {"area_id":"31","parent_id":"1","area_name":"浙江","area_type":"1"}
     * templeCity : {"area_id":"388","parent_id":"31","area_name":"宁波","area_type":"2"}
     * templeCountry : {"area_id":"3284","parent_id":"388","area_name":"鄞州区","area_type":"3"}
     */

    private List<TemplesAllBean> templesAll;

    public List<TemplesAllBean> getTemplesAll() {
        return templesAll;
    }

    public void setTemplesAll(List<TemplesAllBean> templesAll) {
        this.templesAll = templesAll;
    }

    public static class TemplesAllBean {
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
        /**
         * area_id : 31
         * parent_id : 1
         * area_name : 浙江
         * area_type : 1
         */

        private TempleProBean templePro;
        /**
         * area_id : 388
         * parent_id : 31
         * area_name : 宁波
         * area_type : 2
         */

        private TempleCityBean templeCity;
        /**
         * area_id : 3284
         * parent_id : 388
         * area_name : 鄞州区
         * area_type : 3
         */

        private TempleCountryBean templeCountry;

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

        public TempleProBean getTemplePro() {
            return templePro;
        }

        public void setTemplePro(TempleProBean templePro) {
            this.templePro = templePro;
        }

        public TempleCityBean getTempleCity() {
            return templeCity;
        }

        public void setTempleCity(TempleCityBean templeCity) {
            this.templeCity = templeCity;
        }

        public TempleCountryBean getTempleCountry() {
            return templeCountry;
        }

        public void setTempleCountry(TempleCountryBean templeCountry) {
            this.templeCountry = templeCountry;
        }

        public static class TempleProBean {
            private String area_id;
            private String parent_id;
            private String area_name;
            private String area_type;

            public String getArea_id() {
                return area_id;
            }

            public void setArea_id(String area_id) {
                this.area_id = area_id;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getArea_name() {
                return area_name;
            }

            public void setArea_name(String area_name) {
                this.area_name = area_name;
            }

            public String getArea_type() {
                return area_type;
            }

            public void setArea_type(String area_type) {
                this.area_type = area_type;
            }
        }

        public static class TempleCityBean {
            private String area_id;
            private String parent_id;
            private String area_name;
            private String area_type;

            public String getArea_id() {
                return area_id;
            }

            public void setArea_id(String area_id) {
                this.area_id = area_id;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getArea_name() {
                return area_name;
            }

            public void setArea_name(String area_name) {
                this.area_name = area_name;
            }

            public String getArea_type() {
                return area_type;
            }

            public void setArea_type(String area_type) {
                this.area_type = area_type;
            }
        }

        public static class TempleCountryBean {
            private String area_id;
            private String parent_id;
            private String area_name;
            private String area_type;

            public String getArea_id() {
                return area_id;
            }

            public void setArea_id(String area_id) {
                this.area_id = area_id;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getArea_name() {
                return area_name;
            }

            public void setArea_name(String area_name) {
                this.area_name = area_name;
            }

            public String getArea_type() {
                return area_type;
            }

            public void setArea_type(String area_type) {
                this.area_type = area_type;
            }
        }
    }
}
