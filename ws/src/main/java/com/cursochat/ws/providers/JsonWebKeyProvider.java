package com.cursochat.ws.providers;

import com.auth0.jwk.InvalidPublicKeyException;
import com.auth0.jwk.Jwk;
import com.auth0.jwk.JwkException;
import com.auth0.jwk.UrlJwkProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;

public class JsonWebKeyProvider implements KeyProvider{

    private final UrlJwkProvider provider;

    public JsonWebKeyProvider(@Value("${app.auth0.jwks-url}") final String jwtUrl) {
        try {
            this.provider = new UrlJwkProvider(new URL(jwtUrl));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Cacheable("public-key")
    @Override
    public PublicKey getPublicKey(String keyId) {
        try {
            final Jwk jwk = provider.get(keyId);
            return jwk.getPublicKey();
        } catch (JwkException e) {
            throw new RuntimeException(e);
        }
    }
}
