package com.yywh.buddhist.http.pojo;

import java.util.List;

/**
 * 主页数据
 */
public class HomeData {

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

    private List<TemplesBean> temples;
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

    private List<MastersBean> masters;
    /**
     * order_id : 169
     * order_title : 清净世界
     * order_user : 392
     * order_time : 1472095223
     * order_staut : 1
     * order_money : 0.01
     * order_number : 2016082555545210
     * order_tpid : 6
     * order_type : 3
     * order_actid : 10
     * record : {"mu_id":"392","mu_username":"yywhsh","mu_accounts":"yywhsh","mu_pwd":"42b9f2c64ea5469cd59ecf54ade23f0d","mu_name":null,"mu_wx_openid":null,"mu_sex":null,"mu_age":null,"mu_phone":null,"mu_occupation":null,"mu_idcard":null,"mu_nation":null,"mu_time":"1470886504","mu_logo":"http://wx.yywhsh.com/assets/wx/images/user-128.png","mu_country":null,"mu_city":null,"mu_province":null,"mu_platform":"email","mu_email":"yywhsh@icloud.com"}
     */

    private List<MeritListBean> meritList;
    /**
     * ba_id : 3
     * ba_type : 1
     * ba_url : http://wx.yywhsh.com/temple/details?tid=6
     * ba_staut : 1
     * ba_title : 11112
     * ba_time : 1469598429
     * ba_logo : http://wx.yywhsh.com/assets/admin/uploads/2016072710807322.jpg
     */

    private List<BannersBean> banners;

    public List<TemplesBean> getTemples() {
        return temples;
    }

    public void setTemples(List<TemplesBean> temples) {
        this.temples = temples;
    }

    public List<MastersBean> getMasters() {
        return masters;
    }

    public void setMasters(List<MastersBean> masters) {
        this.masters = masters;
    }

    public List<MeritListBean> getMeritList() {
        return meritList;
    }

    public void setMeritList(List<MeritListBean> meritList) {
        this.meritList = meritList;
    }

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public static class TemplesBean {
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

    public static class MastersBean {
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

    public static class MeritListBean {
        private String order_id;
        private String order_title;
        private String order_user;
        private String order_time;
        private String order_staut;
        private String order_money;
        private String order_number;
        private String order_tpid;
        private String order_type;
        private String order_actid;
        /**
         * mu_id : 392
         * mu_username : yywhsh
         * mu_accounts : yywhsh
         * mu_pwd : 42b9f2c64ea5469cd59ecf54ade23f0d
         * mu_name : null
         * mu_wx_openid : null
         * mu_sex : null
         * mu_age : null
         * mu_phone : null
         * mu_occupation : null
         * mu_idcard : null
         * mu_nation : null
         * mu_time : 1470886504
         * mu_logo : http://wx.yywhsh.com/assets/wx/images/user-128.png
         * mu_country : null
         * mu_city : null
         * mu_province : null
         * mu_platform : email
         * mu_email : yywhsh@icloud.com
         */

        private RecordBean record;

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getOrder_title() {
            return order_title;
        }

        public void setOrder_title(String order_title) {
            this.order_title = order_title;
        }

        public String getOrder_user() {
            return order_user;
        }

        public void setOrder_user(String order_user) {
            this.order_user = order_user;
        }

        public String getOrder_time() {
            return order_time;
        }

        public void setOrder_time(String order_time) {
            this.order_time = order_time;
        }

        public String getOrder_staut() {
            return order_staut;
        }

        public void setOrder_staut(String order_staut) {
            this.order_staut = order_staut;
        }

        public String getOrder_money() {
            return order_money;
        }

        public void setOrder_money(String order_money) {
            this.order_money = order_money;
        }

        public String getOrder_number() {
            return order_number;
        }

        public void setOrder_number(String order_number) {
            this.order_number = order_number;
        }

        public String getOrder_tpid() {
            return order_tpid;
        }

        public void setOrder_tpid(String order_tpid) {
            this.order_tpid = order_tpid;
        }

        public String getOrder_type() {
            return order_type;
        }

        public void setOrder_type(String order_type) {
            this.order_type = order_type;
        }

        public String getOrder_actid() {
            return order_actid;
        }

        public void setOrder_actid(String order_actid) {
            this.order_actid = order_actid;
        }

        public RecordBean getRecord() {
            return record;
        }

        public void setRecord(RecordBean record) {
            this.record = record;
        }

        public static class RecordBean {
            private String mu_id;
            private String mu_username;
            private String mu_accounts;
            private String mu_pwd;
            private Object mu_name;
            private Object mu_wx_openid;
            private Object mu_sex;
            private Object mu_age;
            private Object mu_phone;
            private Object mu_occupation;
            private Object mu_idcard;
            private Object mu_nation;
            private String mu_time;
            private String mu_logo;
            private Object mu_country;
            private Object mu_city;
            private Object mu_province;
            private String mu_platform;
            private String mu_email;

            public String getMu_id() {
                return mu_id;
            }

            public void setMu_id(String mu_id) {
                this.mu_id = mu_id;
            }

            public String getMu_username() {
                return mu_username;
            }

            public void setMu_username(String mu_username) {
                this.mu_username = mu_username;
            }

            public String getMu_accounts() {
                return mu_accounts;
            }

            public void setMu_accounts(String mu_accounts) {
                this.mu_accounts = mu_accounts;
            }

            public String getMu_pwd() {
                return mu_pwd;
            }

            public void setMu_pwd(String mu_pwd) {
                this.mu_pwd = mu_pwd;
            }

            public Object getMu_name() {
                return mu_name;
            }

            public void setMu_name(Object mu_name) {
                this.mu_name = mu_name;
            }

            public Object getMu_wx_openid() {
                return mu_wx_openid;
            }

            public void setMu_wx_openid(Object mu_wx_openid) {
                this.mu_wx_openid = mu_wx_openid;
            }

            public Object getMu_sex() {
                return mu_sex;
            }

            public void setMu_sex(Object mu_sex) {
                this.mu_sex = mu_sex;
            }

            public Object getMu_age() {
                return mu_age;
            }

            public void setMu_age(Object mu_age) {
                this.mu_age = mu_age;
            }

            public Object getMu_phone() {
                return mu_phone;
            }

            public void setMu_phone(Object mu_phone) {
                this.mu_phone = mu_phone;
            }

            public Object getMu_occupation() {
                return mu_occupation;
            }

            public void setMu_occupation(Object mu_occupation) {
                this.mu_occupation = mu_occupation;
            }

            public Object getMu_idcard() {
                return mu_idcard;
            }

            public void setMu_idcard(Object mu_idcard) {
                this.mu_idcard = mu_idcard;
            }

            public Object getMu_nation() {
                return mu_nation;
            }

            public void setMu_nation(Object mu_nation) {
                this.mu_nation = mu_nation;
            }

            public String getMu_time() {
                return mu_time;
            }

            public void setMu_time(String mu_time) {
                this.mu_time = mu_time;
            }

            public String getMu_logo() {
                return mu_logo;
            }

            public void setMu_logo(String mu_logo) {
                this.mu_logo = mu_logo;
            }

            public Object getMu_country() {
                return mu_country;
            }

            public void setMu_country(Object mu_country) {
                this.mu_country = mu_country;
            }

            public Object getMu_city() {
                return mu_city;
            }

            public void setMu_city(Object mu_city) {
                this.mu_city = mu_city;
            }

            public Object getMu_province() {
                return mu_province;
            }

            public void setMu_province(Object mu_province) {
                this.mu_province = mu_province;
            }

            public String getMu_platform() {
                return mu_platform;
            }

            public void setMu_platform(String mu_platform) {
                this.mu_platform = mu_platform;
            }

            public String getMu_email() {
                return mu_email;
            }

            public void setMu_email(String mu_email) {
                this.mu_email = mu_email;
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
