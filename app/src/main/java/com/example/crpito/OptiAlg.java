package com.example.crpito;

public class OptiAlg {
    public static final double LOG_PSO_XN = 0.868108929091533;
    public static final double LOG_PSO_A = 4;
    public static final double LOG_ACO_XN = 0.536522798444119;
    public static final double LOG_ACO_A = 4;
    public static final double LOG_DE_XN = 0.850347542213392;
    public static final double LOG_DE_A = 4;
    public static final double LOG_GSA_XN = 0.775550139264662;
    public static final double LOG_GSA_A = 3.99994125842673;
    public static final double LOG_HS_XN = 0.752164288690584;
    public static final double LOG_HS_A = 4;
    public static final double LOG_SOS_XN = 0.117648319430803;
    public static final double LOG_SOS_A = 4;
    public static final double LOG_GOLD_XN = 0.838178032758474;
    public static final double LOG_GOLD_A = 4;

    public static final double TENT_PSO_XN = 0.376830104720830;
    public static final double TENT_PSO_A = 1.99988481645862;
    public static final double TENT_ACO_XN = 0.612965751359665;
    public static final double TENT_ACO_A = 1.99988904374838;
    public static final double TENT_DE_XN = 0.623764324719275;
    public static final double TENT_DE_A = 1.99992147911346;
    public static final double TENT_GSA_XN = 0.483482105582427;
    public static final double TENT_GSA_A = 1.99971304057501;
    public static final double TENT_HS_XN = 0.243655931244311;
    public static final double TENT_HS_A = 1.99986710705295;
    public static final double TENT_SOS_XN = 0.243655931244311; // hep 1 çıkartıyor.
    public static final double TENT_SOS_A = 1.99985929563112;
    public static final double TENT_GOLD_XN = 0.447336291617622;
    public static final double TENT_GOLD_A = 1.99984435977209;


    public static final double SINE_PSO_XN = 0.623295737125813;
    public static final double SINE_PSO_A = 0.999912314082890;
    public static final double SINE_ACO_XN = 0.133421210716500;
    public static final double SINE_ACO_A = 0.999915625480406;
    public static final double SINE_DE_XN = 0.149521122345238;
    public static final double SINE_DE_A = 0.999916878248742;
    public static final double SINE_GSA_XN = 0.459420242005092;
    public static final double SINE_GSA_A = 0.999911078417312;
    public static final double SINE_HS_XN = 0.9077027311014926;
    public static final double SINE_HS_A = 0.999916987710002;
    public static final double SINE_SOS_XN = 0.811794118685255;
    public static final double SINE_SOS_A = 0.999911841093291;
    public static final double SINE_GOLD_XN = 0.521594771719064;
    public static final double SINE_GOLD_A = 0.999915684486761;

    public static final double CIRCLE_PSO_XN = 0.588390648329733;
    public static final double CIRCLE_PSO_A = 0.999985675295998;
    public static final double CIRCLE_PSO_B = 11.505150002351380;
    public static final double CIRCLE_ACO_XN = 0.690907794995265;
    public static final double CIRCLE_ACO_A = 1;
    public static final double CIRCLE_ACO_B = 11.505406419089105;
    public static final double CIRCLE_DE_XN = 0.287548827655056;
    public static final double CIRCLE_DE_A = 1;
    public static final double CIRCLE_DE_B = 11.505084233673600;
    public static final double CIRCLE_GSA_XN = 0.9662744994638604;
    public static final double CIRCLE_GSA_A = 0.955847475491843;
    public static final double CIRCLE_GSA_B = 11.526732914588645;
    public static final double CIRCLE_HS_XN = 0.203741786236828;
    public static final double CIRCLE_HS_A = 0.732029486786325;
    public static final double CIRCLE_HS_B = 10.111626940888310;
    public static final double CIRCLE_SOS_XN = 1;
    public static final double CIRCLE_SOS_A = 1;
    public static final double CIRCLE_SOS_B = 11.505047069744900;
    public static final double CIRCLE_GOLD_XN = 0.101758702702179433;
    public static final double CIRCLE_GOLD_A = 0.999935018082198;
    public static final double CIRCLE_GOLD_B = 11.5055106686560000;

    public static double CurrentValueCreator(StringBuilder value) {
        StringBuilder sb = new StringBuilder();
        StringBuilder kez = new StringBuilder();
        String a;
        int n = 0;
      while(n<=32){
          if(n>=32) break;
           a =  value.substring(n,n+16);
           for (int j = 0; j < 16; j++) {
               char keys = a.charAt(j);
               kez.append(keys);
          }
          int x = (MainActivity.binaryToInteger(kez.toString()))%9;
          sb.append(x);
       n=n+16;
      }

        int Integer = java.lang.Integer.parseInt(sb.toString());
        return Integer;

    }
}