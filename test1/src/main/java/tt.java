import org.jose4j.base64url.Base64;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.jose4j.json.internal.json_simple.parser.JSONParser;
import org.jose4j.json.internal.json_simple.parser.ParseException;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.keys.HmacKey;
import org.jose4j.lang.JoseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;

public class tt {

//generate a JWS format string encoded
        public static void main(String[] args) throws JoseException, ParseException, IOException {
//            System.out.println("Hello World");
//            Calendar c = Calendar.getInstance();
//            System.out.println(c.getTime());
//            c.add(Calendar.MINUTE, 5);
//            System.out.println(c.getTime());
//            String key = "lx2ddOljIMQZt23mW0YwnKKeX7tHmABC5h07J5batwg=";
//            byte[] a = Base64.decode(key);
//            HmacKey testkey = new HmacKey(a);
//            JsonWebSignature jws = new JsonWebSignature();
//            JSONObject payload = new JSONObject();
//            payload.put("name", "xiaohan");
//            payload.put("load", "suibian");
//            jws.setKey(testkey);
//            jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);
//            jws.setHeader("org_alias", "hello");
//            jws.setHeader("token", "world");
//            jws.setPayload(payload.toJSONString());
//            String cus = jws.getCompactSerialization();
//            System.out.println(cus);
//            JSONObject responsePayloadJSON = null;
//            JSONParser parser = new JSONParser();
//            responsePayloadJSON = (JSONObject) parser.parse(jws.getPayload());
//            System.out.println(responsePayloadJSON);
            OutputStreamWriter outputStreamWriter = null;

            URL resturl = new URL("https://idpxnyl3m.pingidentity.com/pingid/rest/4/getuserdetails/do");
            HttpURLConnection urlConnection = (HttpURLConnection) resturl.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.addRequestProperty("Content-Type", "application/json");
            urlConnection.addRequestProperty("Accept", "*/*");

            urlConnection.setDoOutput(true);
            outputStreamWriter = new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8");
            //outputStreamWriter.write("eyJhbGciOiJIUzI1NiIsIm9yZ19hbGlhcyI6IjZlYTRjZWU4LWVjNzctNDMyOC04MmEyLTgxNzJjZDdkMzNlOSIsInRva2VuIjoiYzU3ZWQyMmMyNjRhNDJkZGI4MjI3YjNkZDdlZWYzZGYifQ.eyJyZXFIZWFkZXIiOnsibG9jYWxlIjoiZW4iLCJvcmdBbGlhcyI6IjZlYTRjZWU4LWVjNzctNDMyOC04MmEyLTgxNzJjZDdkMzNlOSIsInNlY3JldEtleSI6ImM1N2VkMjJjMjY0YTQyZGRiODIyN2IzZGQ3ZWVmM2RmIiwidGltZXN0YW1wIjoiMjAyMS0wOC0zMSAxMTo1NzoyNS4yMjkiLCJ2ZXJzaW9uIjoiNC45In0sInJlcUJvZHkiOnsiYWN0aXZhdGVVc2VyIjpmYWxzZSwiZW1haWwiOiJsaXhpYW9oYW41MzQ5QGdtYWlsLmNvbSIsImZOYW1lIjoiWGlhb2hhbiIsImxuYW1lIjoiTGkiLCJ1c2VybmFtZSI6InVzZXIuMSIsInJvbGUiOiJSRUdVTEFSIiwiY2xpZW50RGF0YSI6bnVsbH19.9EOAVy-RN5JjpCAJaYWJ6J7ziiZ_4StrZKEeHANSZrs");
            outputStreamWriter.write("eyJhbGciOiJIUzI1NiIsIm9yZ19hbGlhcyI6IjZlYTRjZWU4LWVjNzctNDMyOC04MmEyLTgxNzJjZDdkMzNlOSIsInRva2VuIjoiYzU3ZWQyMmMyNjRhNDJkZGI4MjI3YjNkZDdlZWYzZGYifQ.eyJyZXFIZWFkZXIiOnsibG9jYWxlIjoiZW4iLCJvcmdBbGlhcyI6IjZlYTRjZWU4LWVjNzctNDMyOC04MmEyLTgxNzJjZDdkMzNlOSIsInNlY3JldEtleSI6ImM1N2VkMjJjMjY0YTQyZGRiODIyN2IzZGQ3ZWVmM2RmIiwidGltZXN0YW1wIjoiMjAyMS0wOC0zMSAxMTo1NzoyNS4yMjkiLCJ2ZXJzaW9uIjoiNC45In0sInJlcUJvZHkiOnsiZ2V0U2FtZURldmljZVVzZXJzIjpmYWxzZSwidXNlck5hbWUiOiJ4aWFvaGFuIiwiY2xpZW50RGF0YSI6IlNlc3Npb24gZGF0YSBlY2hvZWQgYmFjayB0byB0aGUgcmVxdWVzdG9yIn19.CopWS9ekUJ_IlEYIVWOJVMfJgRC90BpTUZkZBtZoANo");
            outputStreamWriter.flush();
            outputStreamWriter.close();
            int responseCode ;
            responseCode = urlConnection.getResponseCode();
            System.out.println(responseCode);
            String encoding = urlConnection.getContentEncoding();
            System.out.println(encoding);
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
            StringBuilder sb = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output+"\n");
            }
            br.close();
            System.out.println(sb.toString());
            }

            public JSONObject buildRequestHeader(){
                JSONObject header = new JSONObject();
                header.put("locale", "en");
                header.put("orgAlias", "6ea4cee8-ec77-4328-82a2-8172cd7d33e9");
                header.put("secretKey", "c57ed22c264a42ddb8227b3dd7eef3df");
                header.put("timestamp", getCurrentTimeStamp());
                header.put("version", "4.9");
                return header;
            }


            static String getCurrentTimeStamp(){
                date now = new Date();
                SimpleDateFormat PingIdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                PingIdFormat.setTimeZone(TimeZone.getTimeZone("America/Boston"));
                return PingIdFormat.format(now);
            }

            Public String buildRequest(JSONObject requestBody){
            JSONObject header = buildRequestHeader();
            JSONObject payload = new JSONObject();

            payload.put("reqHeader", requestHeader);
            payload.put("reqBody", requestBody);

            JsonWebSignature jwt = new JsonWebSignature();
            jwt.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);
            jwt.setHeader("orgAlias", "6ea4cee8-ec77-4328-82a2-8172cd7d33e9")
            jwt.setHeader("token", "c57ed22c264a42ddb8227b3dd7eef3df");

            jwt.setPayload(payload.toString());

            HmacKey key = new HmacKey(Base64.decode());
            jwt.setKey(key);


    }
    }

