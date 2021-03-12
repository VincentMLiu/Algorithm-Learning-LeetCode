package com.xixi;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeTest {


    public static void main(String[] args) {


//        String path = "D:\\Desktop\\hosts";
//
//        generateInClusterIpSet(path);

        System.out.println(generateAnUniqueID());
        System.out.println(generateAnUniqueID());
        System.out.println(generateAnUniqueID());
        System.out.println(generateAnUniqueID());
        System.out.println(generateAnUniqueID());
        System.out.println(generateAnUniqueID());
        System.out.println(generateAnUniqueID());

        Map<String, Object> dd = new HashMap<String, Object>();

        dd.put("id", "aa");
        dd.put("time", 12);

        System.out.println(dd.toString());

    }


    public static String generateAnUniqueID(){
        Random rd = new Random();
        String currentTimeMillis = "" + System.currentTimeMillis();

        String random6Int = String.format("%06d",Integer.valueOf(rd.nextInt(1000000)));

        String ID = currentTimeMillis + "_" + random6Int;

        return ID;
    }



    private static Set<String> generateInClusterIpSet(String etcHostsPath){


        Set<String> clusterIpSet = new HashSet();

        String ipRegex = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher;

        File hostsFile = new File(etcHostsPath);
        int lineNum = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(hostsFile));
            String line;
            while((line = br.readLine()) != null){
                lineNum++;
                line.trim();
                if(line.isEmpty()){
                    continue;
                }
                String[] lineSpli = line.split("\\s");
                //均假设第一位为ip
                String ip = lineSpli[0];

                matcher = pattern.matcher(ip);

                if(matcher.matches()){
                    clusterIpSet.add(ip);
                }else{
                    System.out.println("lineNum [" + lineNum + "] The first column is not an ip :" + line);
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(clusterIpSet);

        return clusterIpSet;

    }

}
