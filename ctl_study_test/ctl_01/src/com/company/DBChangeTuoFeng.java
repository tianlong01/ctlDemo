package com.company;

/**
 * <h1>驼峰DB转换</h1>
 *
 *  <user>chengtianlong</user>
 */
public class DBChangeTuoFeng {
    public static void main(String[] args) {

        /**
         * 去找DB
         */
        String tuoFengToDB = "";
//        tuoFengToDB("SmsMessageGoodsAuto");

        /**
         * 生成vo，form等等复制
         */
        String changeTuoFeng = "" +
                "     activity_lottery_draw_pay_record                       " +
                "";
//        changeTuoFeng(changeTuoFeng);


        /**
         * vo对象
         */
        String createVo = "      `ID` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',\n" +
                "  `APPLY_RECORD_ID` int(11) NOT NULL COMMENT '申请记录ID',\n" +
                "  `USER_ID` varchar(64) NOT NULL COMMENT '用户ID',\n" +
                "  `MONEY` int(11) DEFAULT '0' COMMENT '金额',\n" +
                "  `STATUS` tinyint(1) DEFAULT '1' COMMENT '状态(-1：已退款，0:已删除，1：待支付，2：已支付)',\n" +
                "  `PAY_NO` varchar(64) DEFAULT NULL COMMENT '支付单号',\n" +
                "  `PAY_ORDER_NO` varchar(64) DEFAULT NULL COMMENT '订单号',\n" +
                "  `BACK_ORDER_NO` varchar(64) DEFAULT NULL COMMENT '支付三方单号',\n" +
                "  `PAY_TIME` datetime DEFAULT NULL COMMENT '支付时间',\n" +
                "  `REFUND_TIME` datetime DEFAULT NULL COMMENT '退费日期',\n" +
                "  `PAY_MODE` tinyint(1) DEFAULT NULL COMMENT '支付方式(1：支付宝，2：微信)',\n" +
                "  `CREATE_USER` varchar(64) DEFAULT NULL COMMENT '创建人',\n" +
                "  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',\n" +
                "  `UPDATE_USER` varchar(64) DEFAULT NULL COMMENT '修改人',\n" +
                "  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',  ";
        createVo(createVo);

    }

    /**
     * 转变驼峰命名规则
     * @param name  DB命名
     */
    public static void changeTuoFeng(String name){
        name = name.trim();
        String[] split = name.split("_");
        String vo = "";
        for (String s : split) {
            if("".equals(s)) continue;
            s = s.substring(0,1).toUpperCase()+s.substring(1,s.length());
            vo += s;
        }
        System.out.println(name);
        System.out.println(vo);
        System.out.println(vo+"Vo");
        System.out.println(vo+"Form");
        System.out.println("I"+vo+"Dao");
        System.out.println(vo+"DaoImp");
    }

    /**
     * 转变驼峰命名规则
     * @param name  DB命名
     */
    public static String change2(String name){
        name = name.trim();
        String[] split = name.split("_");
        String vo = "";
        for (String s : split) {
            if("".equals(s)) continue;
            s = s.substring(0,1).toUpperCase()+s.substring(1,s.length());
            vo += s;
        }
        if(!"".equals(vo))  vo = vo.substring(0,1).toLowerCase()+vo.substring(1,vo.length());
        return vo;
    }

    /**
     * 驼峰命名转DB
     * @param name  驼峰命名
     */
    public static void tuoFengToDB(String name){
        name = name.trim();
        String[] split = name.split("(?<!^)(?=[A-Z])");
        String vo = "";
        for (String s : split) {
            if("".equals(s)) continue;
            s = s.substring(0,1).toLowerCase()+s.substring(1,s.length())+"_";
            vo += s;
        }
        System.out.println(name);
        System.out.println(vo.substring(0,vo.length()-1));
    }


    /**
     * vo字段
     * @param sql DDL语句
     */
    public static void createVo(String sql){
        sql = sql.trim();
        String[] split = sql.split("',");
        System.out.println("private static final long serialVersionUID = 1L;");
        System.out.println();
        System.out.println();
        for (String s : split) {
            String[] split1 = s.split("'");
            if(split1.length == 2){
                System.out.println("//"+split1[1]);
            }
            if(split1.length == 4){
                System.out.println("//"+split1[3]);
            }
            String[] split2 = s.split("`");
            System.out.println("@Column(name = \""+split2[1]+"\")");
            System.out.println("private String "+change2(split2[1].trim().toLowerCase())+";");
            System.out.println();

        }


    }

}