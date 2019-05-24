package com.logigear.testfw.conf;

/**
 * 
 * @author ngocquang.tran
 *
 */
public class TestEnvironmentConfig {

	private TestPlatform mode = TestPlatform.UNSUPPORTED;
	private TestTarget target = TestTarget.UNSUPPORTED;
	
	private String envConfig = "";
	
	public TestEnvironmentConfig(String envConfig)
	{
		this.envConfig = envConfig;
		String[] configs = envConfig.split("-");
		if(configs.length == 2){
			this.mode = TestPlatform.fromString(configs[0]);
			this.target = TestTarget.fromString(configs[1]);
		}
	}

	public TestPlatform getPlatform() {
		return mode;
	}

	public TestTarget getRunTarget() {
		return target;
	}
	
	public String getEnvConfigString() {
		return this.envConfig;
	}
	
}
