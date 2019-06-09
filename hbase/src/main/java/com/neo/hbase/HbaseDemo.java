package com.neo.hbase;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.BinaryComparator;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.FamilyFilter;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class HbaseDemo {
    public static Configuration configuration;

    static {
        configuration = HBaseConfiguration.create();
    }

    public static void main(String[] args) {
        try {
            /*HTablePool pool = new HTablePool(configuration, 5);
            HTableInterface table = pool.getTable("hbase");
            Scan scan = new Scan();
            table.getScanner(scan);
            ResultScanner resultScanner = table.getScanner(scan);
            for (Result result : resultScanner) {
                System.out.println(result.toString());
            }*/

            HTable table1 = new HTable(configuration, "hbase");
            Scan scan = new Scan();
            table1.getScanner(scan);
            ResultScanner resultScanner = table1.getScanner(scan);
            for (Result result : resultScanner) {
                System.out.println(result.toString());
            }
            table1.close();

            // list tables
            /*Connection connection = ConnectionFactory.createConnection(configuration);
            Admin admin = connection.getAdmin();
            for (TableName name : admin.listTableNames()) {
                System.out.println(Bytes.toString(name.getName()));
            }

            // scan data
            Table hbase = connection.getTable(TableName.valueOf("hbase"));
            Scan scan = new Scan();
            ResultScanner resultScanner = hbase.getScanner(scan);
            for (Result result : resultScanner) {
                System.out.println(result.toString());
            }

            Filter cFFilter = new FamilyFilter(CompareFilter.CompareOp.EQUAL,
                    new BinaryComparator(Bytes.toBytes("base")));
            scan.setFilter(cFFilter);
            resultScanner = hbase.getScanner(scan);
            for (Result result : resultScanner) {
                System.out.println(result.toString());
            }

            scan.setFilter(null);
            scan.addColumn(Bytes.toBytes("base"), Bytes.toBytes("name"));
            resultScanner = hbase.getScanner(scan);
            for (Result result : resultScanner) {
                System.out.println(result.toString());
            }
            resultScanner.close();*/
        } catch (IOException e) {
            System.out.println("ex = " + e.toString());
        }

    }
}
