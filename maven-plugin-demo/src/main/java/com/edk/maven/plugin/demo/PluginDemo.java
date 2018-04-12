package com.edk.maven.plugin.demo;

import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class PluginDemo extends AbstractMojo {
	
	@Parameter( property = "demo1.name", defaultValue = "Hello World!")
	private String name;
	
	@Parameter( property = "demo1.file", defaultValue = "${project.basedir}/src/main/resources/demo.properties" )
	private File file;

	public void execute() throws MojoExecutionException {
		getLog().info("Hello, world.");
		getLog().info(name);
		Properties prop = new Properties();
		try {
			FileReader fileReader = new FileReader(file);
			prop.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String demoName = prop.getProperty("name");
		getLog().info(demoName);
	}

}
