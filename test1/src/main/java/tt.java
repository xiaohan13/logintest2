import org.jose4j.base64url.Base64;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.jose4j.json.internal.json_simple.parser.JSONParser;
import org.jose4j.json.internal.json_simple.parser.ParseException;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.keys.HmacKey;
import org.jose4j.lang.JoseException;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;

public class tt {

//generate a JWS format string encoded
    public static class T {
        public static void main(String[] args) throws JoseException, ParseException {
            System.out.println("Hello World");
            Calendar c = Calendar.getInstance();
            System.out.println(c.getTime());
            c.add(Calendar.MINUTE, 5);
            System.out.println(c.getTime());
            String key = "lx2ddOljIMQZt23mW0YwnKKeX7tHmABC5h07J5batwg=";
            byte[] a = Base64.decode(key);
            HmacKey testkey = new HmacKey(a);
            JsonWebSignature jws = new JsonWebSignature();
            JSONObject payload = new JSONObject();
            payload.put("name", "xiaohan");
            payload.put("load", "suibian");
            jws.setKey(testkey);
            jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);
            jws.setHeader("org_alias", "hello");
            jws.setHeader("token", "world");
            jws.setPayload(payload.toJSONString());
            String cus = jws.getCompactSerialization();
            System.out.println(cus);
            JSONObject responsePayloadJSON = null;
            JSONParser parser = new JSONParser();
            responsePayloadJSON = (JSONObject) parser.parse(jws.getPayload());
            System.out.println(responsePayloadJSON);
            }
        }
    }

