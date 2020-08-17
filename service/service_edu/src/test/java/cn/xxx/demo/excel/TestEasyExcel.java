package cn.xxx.demo.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestEasyExcel {

    public static void main(String[] args) {
        String filename = "";

        EasyExcel.write(filename,DemoData.class).sheet(0).doWrite(getData());
        EasyExcel.read(filename,DemoData.class,new ExcelListener()).sheet(0).doRead();
    }

    private static List<DemoData> getData(){
        List<DemoData> demoDataList = new ArrayList<>();
        return demoDataList;
    }
}
