package com.turbo;

/**
 * 数组交集
 * @author yutao
 **/
public class Intersection {



    public static void main(String[] args) {
        String[] arr1 = new String[]{"id","iccid","eficcid","imsi","status","profile_type","qr_code","flow_flag","open_msg",
                "msisdn","efimsi","imsi2","efimsi2","imsi3","efimsi3","imsi4","efimsi4 ","imsi5","efimsi5","a_key","hrpdupp",
                "hrpd_ss","uimid_esn","sca","ki","opc","key_index","storage_batchNo","storage_time","release_time","operator_code",
                "operator_name","supplier_code","supplier_name","abandoned_time","abandoned_cause","apn","alg_flag","usage_days_limits",
                "net_format","actual_cover_country","call_flag","management_model","flow_pool_code","flow_pool_name",
                "telecommunications_flag","more_imsi_flag","type","suitable_package_type","busi_data","valid_date","register_status",
                "charge_status","charge_valid_date","speedLimit","remark","init_flag","service_status","first_open",
                "coupona","coupona_expire_time","couponb","couponb_expire_time","coupon_update_time","is_suspend",
                "max_reuse_count","reduplicable_number","is_mplmn"};


        String[] arr2 = new String[]{"id","batch_code","material_code","material_name","supplier_code","supplier_name",
                "operate_code","operator_name","warehouse_code","warehouse_name","iccid","ki","opc","imsi","imsi2","imsi3",
                "imsi4","imsi5","busi_data","msisdn","tel_flag","more_imsi_flag","type","a_key","uimid_esn","hrpdupp",
                "hrpd_ss","user_id","status","imsi_group_code","create_open_id","create_time","has_delete","dispatch_time",
                "key_index","use_type","month","stat_sum","reci_code","reci_name","reci_bill","purchase_code","purchase_name",
                "purchase_bill","network","sca","alg_flag","cover_mcc_name","apn","plmn","fplmn","export_apply_code",
                "import_apply_code","disp_purp_name","disp_busi_name","cancel_reason","dp_code","dp_name","redup_count",
                "max_redup_count","manufacturer_code","reuse_count","max_reuse_count","esim_status","ussd_prefix","valid_date","qr_code"};
        for (int i = 0; i < arr1.length; i++) {
            String charI = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                String charJ = arr2[j];
                if (charI.equals(charJ)) {
                    System.out.println(charI);
                }
            }
        }
    }
}
