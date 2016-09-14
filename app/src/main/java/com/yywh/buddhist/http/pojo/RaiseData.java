package com.yywh.buddhist.http.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class RaiseData {


    /**
     * count(order_id) : 31
     * count : 31
     * sum(order_money) : 105.61
     * money : 105.61
     */

    private MoneySumBean moneySum;
    /**
     * ra_id : 1
     * ra_name : 金莲禅寺部分设施翻修乐助功德
     * ra_time : 1471944234
     * ra_desc : 金莲禅寺翻修功德，不仅能使参与捐资的每一位善信业障清净，福慧增长，亦能更加有序的祈求佛力加持，得人生福寿无量，佑子女学业无双，助财路无限宽广，保生活自在安康。经云“所谓布施者，必获其利益，若为乐布施，后必得安乐”。所有乐助建寺建功德堂的施主，必将得到诸佛菩萨的保佑加被，吉祥如意，所愿速成。
     * ra_amount : 1000000.00
     * ra_tpid : 6
     * ra_end_time : 1483160951
     * ra_staut : 2
     * ra_logo : http://wx.yywhsh.com/assets/admin/uploads/2016080913555404.gif
     * raiseList : {"tp_id":"6","tp_name":"金莲禅寺","tp_desc":"金莲禅寺位于宁波市鄞州区古林镇共任村 ","tp_time":"1469597284","tp_tel":"18049938489","tp_email":"why@yywhsh.com","tp_addres":"金莲禅寺","tp_banner":null,"tp_logo":"http://wx.yywhsh.com/assets/admin/uploads/2016072216239436.gif","tp_staut":"2","tp_coordinate":"121.459607,29.820552","tp_profile":"坐落于宁波市鄞州市","tp_provinces":"31","tp_citys":"388","tp_countrys":"3284","tp_contacts":null,"tp_morien":null}
     * fundraising : {"0":{"order_actid":"1","order_user":"64","order_money":"0.10"},"1":{"order_actid":"1","order_user":"64","order_money":"0.10"},"2":{"order_actid":"1","order_user":"64","order_money":"0.10"},"3":{"order_actid":"1","order_user":"64","order_money":"0.10"},"4":{"order_actid":"1","order_user":"64","order_money":"0.10"},"5":{"order_actid":"1","order_user":"64","order_money":"0.10"},"6":{"order_actid":"1","order_user":"64","order_money":"0.10"},"7":{"order_actid":"1","order_user":"64","order_money":"0.10"},"8":{"order_actid":"1","order_user":"64","order_money":"0.10"},"9":{"order_actid":"1","order_user":"64","order_money":"0.10"},"10":{"order_actid":"1","order_user":"64","order_money":"0.10"},"11":{"order_actid":"1","order_user":"378","order_money":"1.00"},"12":{"order_actid":"1","order_user":"64","order_money":"0.10"},"13":{"order_actid":"1","order_user":"378","order_money":"1.00"},"14":{"order_actid":"1","order_user":"378","order_money":"1.00"},"15":{"order_actid":"1","order_user":"378","order_money":"0.01"},"16":{"order_actid":"1","order_user":"378","order_money":"0.01"},"17":{"order_actid":"1","order_user":"378","order_money":"0.02"},"18":{"order_actid":"1","order_user":"378","order_money":"0.01"},"19":{"order_actid":"1","order_user":"378","order_money":"0.01"},"20":{"order_actid":"1","order_user":"381","order_money":"0.10"},"21":{"order_actid":"1","order_user":"380","order_money":"0.01"},"22":{"order_actid":"1","order_user":"389","order_money":"0.03"},"money":4.4,"count":23}
     */

    private List<RaisesBean> raises;
    /**
     * order_id : 172
     * order_title : 清净世界
     * order_user : 389
     * order_time : 1472112749
     * order_staut : 1
     * order_money : 0.03
     * order_number : 2016082510048981
     * order_tpid : 6
     * order_type : 2
     * order_actid : 1
     * record : {"mu_id":"389","mu_username":"非言.","mu_accounts":null,"mu_pwd":null,"mu_name":null,"mu_wx_openid":"A63047B233E523CE60E7EC4C68BD7701","mu_sex":null,"mu_age":null,"mu_phone":null,"mu_occupation":null,"mu_idcard":null,"mu_nation":null,"mu_time":"1470644890","mu_logo":"http://q.qlogo.cn/qqapp/1105494899/A63047B233E523CE60E7EC4C68BD7701/100","mu_country":null,"mu_city":null,"mu_province":null,"mu_platform":"qq","mu_email":null}
     */

    private List<HomeData.MeritListBean> meritList;
    /**
     * ba_id : 4
     * ba_type : 3
     * ba_url : http://wx.yywhsh.com/master/mercy?tid=6
     * ba_staut : 1
     * ba_title : 11112
     * ba_time : 1469598244
     * ba_logo : http://wx.yywhsh.com/assets/admin/uploads/2016072713279605.png
     */

    private List<BannersBean> banners;

    public MoneySumBean getMoneySum() {
        return moneySum;
    }

    public void setMoneySum(MoneySumBean moneySum) {
        this.moneySum = moneySum;
    }

    public List<RaisesBean> getRaises() {
        return raises;
    }

    public void setRaises(List<RaisesBean> raises) {
        this.raises = raises;
    }

    public List<HomeData.MeritListBean> getMeritList() {
        return meritList;
    }

    public void setMeritList(List<HomeData.MeritListBean> meritList) {
        this.meritList = meritList;
    }

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public static class MoneySumBean {
        @JSONField(name = "count(order_id)")
        private String orderCount;
        @JSONField(format = "sum(order_money)")
        private String sum;
        private String count;
        private String money;

        public String getOrderCount() {
            return orderCount;
        }

        public void setOrderCount(String orderCount) {
            this.orderCount = orderCount;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getSum() {
            return sum;
        }

        public void setSum(String sum) {
            this.sum = sum;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }
    }

    public static class RaisesBean {
        private String ra_id;
        private String ra_name;
        private String ra_time;
        private String ra_desc;
        private String ra_amount;
        private String ra_tpid;
        private String ra_end_time;
        private String ra_staut;
        private String ra_logo;
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
        /**
         * 0 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 1 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 2 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 3 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 4 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 5 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 6 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 7 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 8 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 9 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 10 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 11 : {"order_actid":"1","order_user":"378","order_money":"1.00"}
         * 12 : {"order_actid":"1","order_user":"64","order_money":"0.10"}
         * 13 : {"order_actid":"1","order_user":"378","order_money":"1.00"}
         * 14 : {"order_actid":"1","order_user":"378","order_money":"1.00"}
         * 15 : {"order_actid":"1","order_user":"378","order_money":"0.01"}
         * 16 : {"order_actid":"1","order_user":"378","order_money":"0.01"}
         * 17 : {"order_actid":"1","order_user":"378","order_money":"0.02"}
         * 18 : {"order_actid":"1","order_user":"378","order_money":"0.01"}
         * 19 : {"order_actid":"1","order_user":"378","order_money":"0.01"}
         * 20 : {"order_actid":"1","order_user":"381","order_money":"0.10"}
         * 21 : {"order_actid":"1","order_user":"380","order_money":"0.01"}
         * 22 : {"order_actid":"1","order_user":"389","order_money":"0.03"}
         * money : 4.4
         * count : 23
         */

        private FundraisingBean fundraising;

        public String getRa_id() {
            return ra_id;
        }

        public void setRa_id(String ra_id) {
            this.ra_id = ra_id;
        }

        public String getRa_name() {
            return ra_name;
        }

        public void setRa_name(String ra_name) {
            this.ra_name = ra_name;
        }

        public String getRa_time() {
            return ra_time;
        }

        public void setRa_time(String ra_time) {
            this.ra_time = ra_time;
        }

        public String getRa_desc() {
            return ra_desc;
        }

        public void setRa_desc(String ra_desc) {
            this.ra_desc = ra_desc;
        }

        public String getRa_amount() {
            return ra_amount;
        }

        public void setRa_amount(String ra_amount) {
            this.ra_amount = ra_amount;
        }

        public String getRa_tpid() {
            return ra_tpid;
        }

        public void setRa_tpid(String ra_tpid) {
            this.ra_tpid = ra_tpid;
        }

        public String getRa_end_time() {
            return ra_end_time;
        }

        public void setRa_end_time(String ra_end_time) {
            this.ra_end_time = ra_end_time;
        }

        public String getRa_staut() {
            return ra_staut;
        }

        public void setRa_staut(String ra_staut) {
            this.ra_staut = ra_staut;
        }

        public String getRa_logo() {
            return ra_logo;
        }

        public void setRa_logo(String ra_logo) {
            this.ra_logo = ra_logo;
        }

        public RaiseListBean getRaiseList() {
            return raiseList;
        }

        public void setRaiseList(RaiseListBean raiseList) {
            this.raiseList = raiseList;
        }

        public FundraisingBean getFundraising() {
            return fundraising;
        }

        public void setFundraising(FundraisingBean fundraising) {
            this.fundraising = fundraising;
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

        public static class FundraisingBean {
            private double money;
            private int count;

            public double getMoney() {
                return money;
            }

            public void setMoney(double money) {
                this.money = money;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
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
