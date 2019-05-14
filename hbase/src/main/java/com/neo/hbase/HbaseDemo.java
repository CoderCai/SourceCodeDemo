package com.neo.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.List;

public class HbaseDemo {
    public static Configuration configuration;
    static {
        configuration = HBaseConfiguration.create();
    }

    public static void main(String[] args) {
        try {
            Connection connection = ConnectionFactory.createConnection(configuration);
            Admin admin = connection.getAdmin();
            for (TableName name : admin.listTableNames()) {
                System.out.println(Bytes.toString(name.getName()));
            }
        } catch (IOException e) {
            System.out.println("ex = " + e.toString());
        }

    }
}
