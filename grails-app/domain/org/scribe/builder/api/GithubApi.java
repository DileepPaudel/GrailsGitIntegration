package org.scribe.builder.api;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.scribe.model.*;
import org.scribe.utils.*;

public class GithubApi extends DefaultApi10a {

	 private static final String AUTHORIZE_URL = "https://github.com/login/oauth/authorize?client_id=%s&redirect_uri=%s";
	 private static final String REQUEST_TOKEN_URL = "https://github.com/login/oauth/access_token?client_id=%s&redirect_uri=%s";
	 
	 private final Set<String> scopes;
	 
	 public GithubApi()
	 {
		 scopes = Collections.emptySet();
	 }
	 
	 public GithubApi(Set<String> scopes)
	  {
	    this.scopes = Collections.unmodifiableSet(scopes);
	  }
	 
	@Override
	public String getRequestTokenEndpoint() {
		// TODO Auto-generated method stub
		 return scopes.isEmpty() ? REQUEST_TOKEN_URL : REQUEST_TOKEN_URL + "?scope=" + scopesAsString();
	}
	 private String scopesAsString()
	  {
	    StringBuilder builder = new StringBuilder();
	    for(String scope : scopes)
	    {
	      builder.append("+" + scope);
	    }
	    return builder.substring(1);
	  }

	@Override
	public String getAccessTokenEndpoint() {
		// TODO Auto-generated method stub
		return "https://github.com/login/oauth/access_token";
	}

	@Override
	public String getAuthorizationUrl(Token requestToken) {
		// TODO Auto-generated method stub
		return String.format(AUTHORIZE_URL, requestToken.getToken());
	}
	 public static GithubApi withScopes(String... scopes)
	  {
	    Set<String> scopeSet = new HashSet<String>(Arrays.asList(scopes));
	    return new GithubApi(scopeSet);
	  }
	


}
