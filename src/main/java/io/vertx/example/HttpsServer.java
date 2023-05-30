package io.vertx.example;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.PemKeyCertOptions;

public class HttpsServer {

    public static void main(String[] args) {

        Vertx.vertx().createHttpServer(new HttpServerOptions()
                .setUseAlpn(true)
                .setSsl(true)
                .setPemKeyCertOptions(new PemKeyCertOptions()
                        .setKeyValue(Buffer.buffer(key))
                        .setCertValue(Buffer.buffer(cert))
                )
        ).requestHandler(req -> req.response().end("Hello World!\n")).listen(8443);

    }

    private static String key = "-----BEGIN PRIVATE KEY-----\n"
            + "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCqGVh44aWUh0F8\n"
            + "NQdWzIFAGdbNlSHzaVeOOPcT+E1LaUF0A8MxwIGq7OUVTpFhYN2V3MowqS9kdFo1\n"
            + "R/ILsn13jPW+I7xk3VLnY1fD9Cbwk/16TXy2PbjDM2Q5AVEmpW8yIbdg+xtQNYKl\n"
            + "RJagbo+Y3zvBL304o3ODJqvNmYSe+ohZiJgpldYAIBn3YCxx8zMXEcAkaTF4XfAh\n"
            + "FFZOeB1Vv7iQ42hQTT3xMoeiqNKVCcMwqhRGE01Uga+sUOORhaitkdIbdRuCuR/4\n"
            + "JwZAowZwyNXpDyKvOE0QUV5ZYwx9B1IPHaHWanw65oOGQWa12s8FizEgtKfoMqQm\n"
            + "qbfL442zAgMBAAECggEAKUc9URhxNjociifUQBwgwY2DsyAdvRQzSzBHxXDcURCZ\n"
            + "8a14EPrGfNRAQ4ttfFQlcdjCuExWU+poecWb13rZN8ndWOcTMOcE12IkSklVqcxA\n"
            + "Fw321cLks3olODA5oUdEVMYZ2k8VscFKkxCx/PzXnCGQPrFnkfcYcRtRVfOLW4jL\n"
            + "b2Hb14VveRrVhXs2cmGcmF5dTbtekOYJs9SCYed3bwfAgQG10yrwp+T7Q8jb7VB/\n"
            + "pviU4w6uWl22/3nfCPZzW/ccEpwwiukvlUDnU5z/Wu7pTI1jT/vTu9YOeL4Z417I\n"
            + "Dneggew+bE2X9jZK6nmAx5I79RUulQjTP/A+/JKNAQKBgQDZlTYoEpZDZ5HiZr/q\n"
            + "jmwvkLrZ9LaH6kfWtYSi8CB8+9l/qH/ee6jfr+aNfaJwQc/cGiBmBr6p2GnFB0Hz\n"
            + "ZRAP8hB9EN6xmV5FGGipExpiGwW5EtliOS3y6PydQoaf1wm6eN1Ht2P+n8bZ28rg\n"
            + "4NYiqgEPYsn43qbFZrfPPQEVDQKBgQDIIdrBlKjswqCGXmSSigeLmwYyOZpBTyvR\n"
            + "69kARXWb3kpqNyl7EnDMLme9vOkHT++FW69ZU+B2hrdQrYsZVdX6TZ9V6kLrFcDu\n"
            + "ePmniSZ4KseuKlHTj88OkcwW3wdkYh3b4XWuL02RTKLxM8NAzDDKNy1b1E4Jh13k\n"
            + "yjDES6P9vwKBgQCWOFVWn1aNHPF0jRoNV91LjbHjjveCqPaGP3ZehEj54WuNnokB\n"
            + "0wCJx0j3APloZZebz5H0vs1eOCL2PAeFgo3vZGGL51zI4ylZrPt9V8oMV7nAyEm7\n"
            + "bdzSa5cU//wwWOfHjXDA9dWc0zUX7o6IadKNxi/LLpphL1+WxE89TlHz9QKBgQC4\n"
            + "PAowyJSVmDnEWKMHD5AQoX6bv9FUK/jv/8i9ajPxcDpa+zrxdDFolZOk5II03A5o\n"
            + "WtXaSs/I7Q1WdNwnT5BzIv/6THScC2OXZMCWzTgfyWoW2BiJxMpc5DTYHSql63kH\n"
            + "UM9PsXYbu0wI9ZjaTt7fWNolvhS0yuvR0ZwBKIzn6wKBgD/70N9IbpiwBvRSavjE\n"
            + "0YauFOKzRmgWZOe2DX2zfnAG9AZIwJUdmhQUXTlJ6jd7eG/FZii2O6SCkEvni5Tl\n"
            + "bT4dhFhZ4UxwFLrsm1yqPSkXAd/QnsF5iLqapjvtcTk8Z5mRYPoKQrICO2DYFaft\n"
            + "E1Ashm1HC4R9wQFGO6MB063i\n"
            + "-----END PRIVATE KEY-----\n";

    private static String cert = "-----BEGIN CERTIFICATE-----\n"
            + "MIIDZTCCAk2gAwIBAgIUcx8FZRY1bdc+h/FpVcElfB4cA9EwDQYJKoZIhvcNAQEL\n"
            + "BQAwQjELMAkGA1UEBhMCWFgxFTATBgNVBAcMDERlZmF1bHQgQ2l0eTEcMBoGA1UE\n"
            + "CgwTRGVmYXVsdCBDb21wYW55IEx0ZDAeFw0yMzA1MzAwNjUyNDFaFw0zMzA1Mjcw\n"
            + "NjUyNDFaMEIxCzAJBgNVBAYTAlhYMRUwEwYDVQQHDAxEZWZhdWx0IENpdHkxHDAa\n"
            + "BgNVBAoME0RlZmF1bHQgQ29tcGFueSBMdGQwggEiMA0GCSqGSIb3DQEBAQUAA4IB\n"
            + "DwAwggEKAoIBAQCqGVh44aWUh0F8NQdWzIFAGdbNlSHzaVeOOPcT+E1LaUF0A8Mx\n"
            + "wIGq7OUVTpFhYN2V3MowqS9kdFo1R/ILsn13jPW+I7xk3VLnY1fD9Cbwk/16TXy2\n"
            + "PbjDM2Q5AVEmpW8yIbdg+xtQNYKlRJagbo+Y3zvBL304o3ODJqvNmYSe+ohZiJgp\n"
            + "ldYAIBn3YCxx8zMXEcAkaTF4XfAhFFZOeB1Vv7iQ42hQTT3xMoeiqNKVCcMwqhRG\n"
            + "E01Uga+sUOORhaitkdIbdRuCuR/4JwZAowZwyNXpDyKvOE0QUV5ZYwx9B1IPHaHW\n"
            + "anw65oOGQWa12s8FizEgtKfoMqQmqbfL442zAgMBAAGjUzBRMB0GA1UdDgQWBBTn\n"
            + "lACb+mCXYMgS47bNohgce/JSIDAfBgNVHSMEGDAWgBTnlACb+mCXYMgS47bNohgc\n"
            + "e/JSIDAPBgNVHRMBAf8EBTADAQH/MA0GCSqGSIb3DQEBCwUAA4IBAQB7kdsu4kf4\n"
            + "zaEdSeJED+rVsAjctiydpbPL+eHkPsvogIVDgaIR7xkb+azNWZSnvx8AmKlqjj2A\n"
            + "kEbeEHnnJRu+Yfu5MZrySdg3irypoPU+4ibHzLJsi9lzvT5kGqjT01y68TRfNp50\n"
            + "2THYZKyN32E4U1wVtOKV55iRgVucI3eb5Oivy4Nbx09H6v+XMACFPYOd9xwf2jos\n"
            + "qKIVAOUjn2d39d8CRdtL/ASzFFal7j1epmoWfwg1mnT8QrksL6G35b3pRxlIjWrc\n"
            + "KBQGNKPIA1N0AunqRZDNB/q2x53SAqs2P9dVsLq6O+miULTTIN2m2O2tlc3LcbCX\n"
            + "c9/AYQzU2b2y\n"
            + "-----END CERTIFICATE-----\n";

}
