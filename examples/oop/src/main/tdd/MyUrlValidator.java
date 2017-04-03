package tdd;

public class MyUrlValidator {
	private boolean allowFileUrls;
	private boolean allowCustomPorts;
	private boolean allowSubDomains;
	
	public void allowFileUrls(boolean allow){
		this.allowFileUrls = allow;
	}
	public void allowSubDomains(boolean allow){
		this.allowSubDomains = allow;
	}
	public void allowCustomPorts(boolean allow){
		this.allowCustomPorts = allow;
	}
	
	public boolean isValidUrl(String url){
		boolean checkFileUrls = false;
		boolean checkSubDomains = false;
		boolean checkCustomPorts = false;
		
		if(allowFileUrls){
			checkFileUrls = isContainsFileUrl(url);
		}
		if(allowSubDomains){
			checkSubDomains = isContainsSubDomain(url);
		}
		if(allowCustomPorts){
			checkCustomPorts = isContainsCustomPorts(url);
		}
		System.out.println(url + " | file:"+checkFileUrls+" subdomain:"+checkSubDomains+" port:"+checkCustomPorts);
		if(checkFileUrls || checkSubDomains || checkCustomPorts){
			return true;
		}
		return false;
	}
	
	private boolean isContainsCustomPorts(String url){
		String[] urlSplit = url.split(":");
		System.out.println("port split "+urlSplit.length);
		return urlSplit.length==3;
	}
	private boolean isContainsSubDomain(String url){
		String[] urlSplit = url.split("\\.");	// http://stackoverflow.com/questions/14833008/java-string-split-with-dot, because "." treat as regex
		System.out.println("subdomain split "+urlSplit.length);
		return urlSplit.length>=3;
	}
	private boolean isContainsFileUrl(String url){
		return url.contains("file://");
	}
}
