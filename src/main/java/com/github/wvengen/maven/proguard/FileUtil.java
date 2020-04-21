package com.github.wvengen.maven.proguard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

public class FileUtil {

	public static List<String> readFile(File file){
		List<String> list=Lists.newArrayList();
		BufferedReader	 breader=null;
		try{
			FileReader reader=new FileReader(file);
			breader=new BufferedReader(reader);
			String line=null;
			while((  line=breader.readLine())!=null) {
				list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(breader!=null) {
				try {
					breader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
}
