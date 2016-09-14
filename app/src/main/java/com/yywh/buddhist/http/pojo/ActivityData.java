package com.yywh.buddhist.http.pojo;

import java.util.List;

/**
 * 活動
 */
public class ActivityData {

    /**
     * new_id : 34
     * new_title : 大乘本生心地观经：法宝的功德
     * new_tpid : 6
     * new_time : 1472089797
     * new_count : 7
     * new_content : 诸善男子
     * new_logo : null
     * raiseList : {"tp_id":"6","tp_name":"金莲禅寺"}
     */

    private List<NewsBean> news;
    /**
     * at_id : 9
     * at_tpid : 6
     * at_name : 中元节地藏超度法会
     * at_start_time : 1471395600
     * at_end_time : 1471426200
     * at_sign_time : 1470887873
     * at_sign_end_time : 1471363129
     * at_statu : 2
     * at_content : 求学业...
     * at_time : 1472091021
     * at_volunteer : 0
     * at_logo : http://wx.yywhsh.com/assets/admin/uploads/2016081112600074.jpg
     * at_volunteer_content : 为
     * at_contacts : 姚文倩
     * at_contacts_phone : 15801933118
     * at_addres : 上海市宝山区淞肇路366号 一溪云净舍
     * at_amount : 100000.00
     * raiseList : {"tp_id":"6","tp_name":"金莲禅寺","tp_desc":"金莲禅寺位于宁波市鄞州区古林镇共任村 ","tp_time":"1469597284","tp_tel":"18049938489","tp_email":"why@yywhsh.com","tp_addres":"金莲禅寺","tp_banner":null,"tp_logo":"http://wx.yywhsh.com/assets/admin/uploads/2016072216239436.gif","tp_staut":"2","tp_coordinate":"121.459607,29.820552","tp_profile":"坐落于宁波市鄞州市","tp_provinces":"31","tp_citys":"388","tp_countrys":"3284","tp_contacts":null,"tp_morien":null}
     * joinNum : {}
     * day : 1
     */

    private List<ActivityBean> activity;
    /**
     * ba_id : 5
     * ba_type : 4
     * ba_url : http://wx.yywhsh.com/activity/details?atid=9&vo_id=0
     * ba_staut : 1
     * ba_title : 中元节地藏超度法会
     * ba_time : 1471314505
     * ba_logo : http://wx.yywhsh.com/assets/admin/uploads/2016081610281231.png
     */

    private List<BannersBean> banners;

    public List<NewsBean> getNews() {
        return news;
    }

    public void setNews(List<NewsBean> news) {
        this.news = news;
    }

    public List<ActivityBean> getActivity() {
        return activity;
    }

    public void setActivity(List<ActivityBean> activity) {
        this.activity = activity;
    }

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public static class NewsBean {
        private String new_id;
        private String new_title;
        private String new_tpid;
        private String new_time;
        private String new_count;
        private String new_content;
        private Object new_logo;
        /**
         * tp_id : 6
         * tp_name : 金莲禅寺
         */

        private RaiseListBean raiseList;

        public String getNew_id() {
            return new_id;
        }

        public void setNew_id(String new_id) {
            this.new_id = new_id;
        }

        public String getNew_title() {
            return new_title;
        }

        public void setNew_title(String new_title) {
            this.new_title = new_title;
        }

        public String getNew_tpid() {
            return new_tpid;
        }

        public void setNew_tpid(String new_tpid) {
            this.new_tpid = new_tpid;
        }

        public String getNew_time() {
            return new_time;
        }

        public void setNew_time(String new_time) {
            this.new_time = new_time;
        }

        public String getNew_count() {
            return new_count;
        }

        public void setNew_count(String new_count) {
            this.new_count = new_count;
        }

        public String getNew_content() {
            return new_content;
        }

        public void setNew_content(String new_content) {
            this.new_content = new_content;
        }

        public Object getNew_logo() {
            return new_logo;
        }

        public void setNew_logo(Object new_logo) {
            this.new_logo = new_logo;
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
        }
    }

    public static class ActivityBean {
        private String at_id;
        private String at_tpid;
        private String at_name;
        private String at_start_time;
        private String at_end_time;
        private String at_sign_time;
        private String at_sign_end_time;
        private String at_statu;
        private String at_content;
        private String at_time;
        private String at_volunteer;
        private String at_logo;
        private String at_volunteer_content;
        private String at_contacts;
        private String at_contacts_phone;
        private String at_addres;
        private String at_amount;
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
        private JoinNumBean joinNum;
        private int day;

        public String getAt_id() {
            return at_id;
        }

        public void setAt_id(String at_id) {
            this.at_id = at_id;
        }

        public String getAt_tpid() {
            return at_tpid;
        }

        public void setAt_tpid(String at_tpid) {
            this.at_tpid = at_tpid;
        }

        public String getAt_name() {
            return at_name;
        }

        public void setAt_name(String at_name) {
            this.at_name = at_name;
        }

        public String getAt_start_time() {
            return at_start_time;
        }

        public void setAt_start_time(String at_start_time) {
            this.at_start_time = at_start_time;
        }

        public String getAt_end_time() {
            return at_end_time;
        }

        public void setAt_end_time(String at_end_time) {
            this.at_end_time = at_end_time;
        }

        public String getAt_sign_time() {
            return at_sign_time;
        }

        public void setAt_sign_time(String at_sign_time) {
            this.at_sign_time = at_sign_time;
        }

        public String getAt_sign_end_time() {
            return at_sign_end_time;
        }

        public void setAt_sign_end_time(String at_sign_end_time) {
            this.at_sign_end_time = at_sign_end_time;
        }

        public String getAt_statu() {
            return at_statu;
        }

        public void setAt_statu(String at_statu) {
            this.at_statu = at_statu;
        }

        public String getAt_content() {
            return at_content;
        }

        public void setAt_content(String at_content) {
            this.at_content = at_content;
        }

        public String getAt_time() {
            return at_time;
        }

        public void setAt_time(String at_time) {
            this.at_time = at_time;
        }

        public String getAt_volunteer() {
            return at_volunteer;
        }

        public void setAt_volunteer(String at_volunteer) {
            this.at_volunteer = at_volunteer;
        }

        public String getAt_logo() {
            return at_logo;
        }

        public void setAt_logo(String at_logo) {
            this.at_logo = at_logo;
        }

        public String getAt_volunteer_content() {
            return at_volunteer_content;
        }

        public void setAt_volunteer_content(String at_volunteer_content) {
            this.at_volunteer_content = at_volunteer_content;
        }

        public String getAt_contacts() {
            return at_contacts;
        }

        public void setAt_contacts(String at_contacts) {
            this.at_contacts = at_contacts;
        }

        public String getAt_contacts_phone() {
            return at_contacts_phone;
        }

        public void setAt_contacts_phone(String at_contacts_phone) {
            this.at_contacts_phone = at_contacts_phone;
        }

        public String getAt_addres() {
            return at_addres;
        }

        public void setAt_addres(String at_addres) {
            this.at_addres = at_addres;
        }

        public String getAt_amount() {
            return at_amount;
        }

        public void setAt_amount(String at_amount) {
            this.at_amount = at_amount;
        }

        public RaiseListBean getRaiseList() {
            return raiseList;
        }

        public void setRaiseList(RaiseListBean raiseList) {
            this.raiseList = raiseList;
        }

        public JoinNumBean getJoinNum() {
            return joinNum;
        }

        public void setJoinNum(JoinNumBean joinNum) {
            this.joinNum = joinNum;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public static class RaiseListBean {
        }

        public static class JoinNumBean {

            private int count;

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
