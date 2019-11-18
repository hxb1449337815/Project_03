package com.bos.mapper;

import com.bos.model.AccBusinessadmissibility;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccBusinessadmissibilityMapper {

    @Delete("delete from ACC_BUSINESSADMISSIBILITY\n" +
            "    where ID = #{ID,jdbcType=NUMERIC}")
    int deleteByPrimaryKey(Short ID);

    @Insert("insert into acc_businessadmissibility values(#{ID,jdbcType=NUMERIC}, #{BUSINESSNOTICENO,jdbcType=VARCHAR}, #{RESERVATIONTIME,jdbcType=TIMESTAMP}, \n" +
            "      #{CUSTOMNAME,jdbcType=VARCHAR}, #{PICKUPADDRESS,jdbcType=VARCHAR}, #{CUSTOMCODE,jdbcType=VARCHAR}, \n" +
            "      #{LINKMAN,jdbcType=VARCHAR}, #{TELPHONE,jdbcType=VARCHAR}, #{WEIGHT,jdbcType=NUMERIC}, \n" +
            "      #{VOLUME,jdbcType=NUMERIC}, #{IMPORTANTHINTS,jdbcType=VARCHAR}, #{ARRIVECITY,jdbcType=VARCHAR}, \n" +
            "      #{PICKERINFO,jdbcType=NUMERIC}, #{SENDADDRESS,jdbcType=VARCHAR}, #{PROCESSINGUNIT,jdbcType=NUMERIC}, \n" +
            "      #{NOTIFICATIONSOURCE,jdbcType=NUMERIC}, #{CUSTOMNOMODIFYFLAG,jdbcType=NUMERIC}, \n" +
            "      #{SINGLETYPE,jdbcType=VARCHAR}, #{PACKAGESNUM,jdbcType=NUMERIC}, #{ACTUALWEIGHT,jdbcType=NUMERIC}, \n" +
            "      #{BILLINGWEIGHT,jdbcType=NUMERIC}, #{PACKINGFEE,jdbcType=NUMERIC}, #{ACTUALPACKING,jdbcType=NUMERIC}\n" +
            "      )")
    int insert(AccBusinessadmissibility record);

    int insertSelective(AccBusinessadmissibility record);

    AccBusinessadmissibility selectByPrimaryKey(Short ID);

    int updateByPrimaryKeySelective(AccBusinessadmissibility record);


    int updateByPrimaryKey(AccBusinessadmissibility record);

    //业务受理信息
    @Select("<script>" +
            "select * from (select a.*,rownum rn from acc_businessadmissibility a) where rn>=1 and rn<=5" +
            "</script>")
    List<AccBusinessadmissibility> getList();
}