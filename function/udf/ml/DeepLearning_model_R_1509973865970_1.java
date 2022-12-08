/**
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package io.confluent.ksql.function.udf.ml;

/**
 * Created by hojjat on 11/15/17.
 */
/*
  Licensed under the Apache License, Version 2.0
    http://www.apache.org/licenses/LICENSE-2.0.html

  AUTOGENERATED BY H2O at 2017-11-06T14:16:14.440+01:00
  3.14.0.3

  Standalone prediction code with sample test data for DeepLearningModel named DeepLearning_model_R_1509973865970_1

  How to download, compile and execute:
      mkdir tmpdir
      cd tmpdir
      curl http:/localhost/127.0.0.1:54321/3/h2o-genmodel.jar > h2o-genmodel.jar
      curl http:/localhost/127.0.0.1:54321/3/Models.java/DeepLearning_model_R_1509973865970_1 > DeepLearning_model_R_1509973865970_1.java
      javac -cp h2o-genmodel.jar -J-Xmx2g -J-XX:MaxPermSize=128m DeepLearning_model_R_1509973865970_1.java

     (Note:  Try java argument -XX:+PrintCompilation to show runtime JIT compiler behavior.)
*/

import java.util.Map;
import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name="DeepLearning_model_R_1509973865970_1", algorithm="deeplearning")
public class DeepLearning_model_R_1509973865970_1 extends GenModel {
  public hex.ModelCategory getModelCategory() { return hex.ModelCategory.AutoEncoder; }
  public boolean isSupervised() { return false; }
  public int nfeatures() { return 210; }
  public int nclasses() { return 210; }
  // Thread-local storage for input neuron activation values.
  final double[] NUMS = new double[210];
  static class NORMMUL implements java.io.Serializable {
    public static final double[] VALUES = new double[210];
    static {
      NORMMUL_0.fill(VALUES);
    }
    static final class NORMMUL_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = 0.20920502092050208;
        sa[1] = 0.2066115702479339;
        sa[2] = 0.2061855670103093;
        sa[3] = 0.20449897750511245;
        sa[4] = 0.20366598778004072;
        sa[5] = 0.20449897750511248;
        sa[6] = 0.20449897750511245;
        sa[7] = 0.2053388090349076;
        sa[8] = 0.20703933747412007;
        sa[9] = 0.2092050209205021;
        sa[10] = 0.21276595744680854;
        sa[11] = 0.22123893805309736;
        sa[12] = 0.23201856148491876;
        sa[13] = 0.24875621890547267;
        sa[14] = 0.2695417789757412;
        sa[15] = 0.29585798816568043;
        sa[16] = 0.3267973856209151;
        sa[17] = 0.3623188405797102;
        sa[18] = 0.4016064257028112;
        sa[19] = 0.4504504504504505;
        sa[20] = 0.47393364928909965;
        sa[21] = 0.5780346820809247;
        sa[22] = 0.6666666666666666;
        sa[23] = 0.7633587786259545;
        sa[24] = 0.8064516129032256;
        sa[25] = 0.7812500000000004;
        sa[26] = 0.7246376811594204;
        sa[27] = 0.684931506849315;
        sa[28] = 0.6493506493506493;
        sa[29] = 0.628930817610063;
        sa[30] = 0.6172839506172839;
        sa[31] = 0.606060606060606;
        sa[32] = 0.588235294117647;
        sa[33] = 0.595238095238095;
        sa[34] = 0.588235294117647;
        sa[35] = 0.5714285714285714;
        sa[36] = 0.5649717514124293;
        sa[37] = 0.5747126436781609;
        sa[38] = 0.5681818181818182;
        sa[39] = 0.5555555555555556;
        sa[40] = 0.5434782608695653;
        sa[41] = 0.5405405405405407;
        sa[42] = 0.5494505494505494;
        sa[43] = 0.5494505494505494;
        sa[44] = 0.5464480874316939;
        sa[45] = 0.53475935828877;
        sa[46] = 0.5235602094240838;
        sa[47] = 0.5154639175257731;
        sa[48] = 0.5102040816326531;
        sa[49] = 0.5076142131979696;
        sa[50] = 0.505050505050505;
        sa[51] = 0.5076142131979696;
        sa[52] = 0.5076142131979696;
        sa[53] = 0.5128205128205128;
        sa[54] = 0.5076142131979696;
        sa[55] = 0.5181347150259068;
        sa[56] = 0.5263157894736841;
        sa[57] = 0.5291005291005292;
        sa[58] = 0.5376344086021507;
        sa[59] = 0.5405405405405407;
        sa[60] = 0.5434782608695653;
        sa[61] = 0.5464480874316939;
        sa[62] = 0.5464480874316939;
        sa[63] = 0.5586592178770949;
        sa[64] = 0.5714285714285714;
        sa[65] = 0.5952380952380953;
        sa[66] = 0.6097560975609754;
        sa[67] = 0.6329113924050632;
        sa[68] = 0.6711409395973154;
        sa[69] = 0.7092198581560283;
        sa[70] = 0.7299270072992701;
        sa[71] = 0.8064516129032256;
        sa[72] = 0.8771929824561406;
        sa[73] = 0.9523809523809526;
        sa[74] = 1.0101010101010108;
        sa[75] = 1.0869565217391295;
        sa[76] = 1.2048192771084336;
        sa[77] = 1.3513513513513526;
        sa[78] = 1.4492753623188397;
        sa[79] = 1.5624999999999987;
        sa[80] = 1.7543859649122797;
        sa[81] = 2.0408163265306114;
        sa[82] = 2.173913043478261;
        sa[83] = 2.2222222222222214;
        sa[84] = 2.4390243902439015;
        sa[85] = 2.7027027027027017;
        sa[86] = 3.03030303030303;
        sa[87] = 2.85714285714286;
        sa[88] = 3.03030303030303;
        sa[89] = 3.571428571428568;
        sa[90] = 3.7037037037037095;
        sa[91] = 3.7037037037037095;
        sa[92] = 3.7037037037037095;
        sa[93] = 3.8461538461538494;
        sa[94] = 3.8461538461538494;
        sa[95] = 3.7037037037036975;
        sa[96] = 3.7037037037036975;
        sa[97] = 4.0;
        sa[98] = 3.7037037037036975;
        sa[99] = 3.7037037037036975;
        sa[100] = 4.0;
        sa[101] = 3.7037037037037095;
        sa[102] = 3.7037037037037095;
        sa[103] = 3.8461538461538494;
        sa[104] = 3.571428571428568;
        sa[105] = 3.7037037037037095;
        sa[106] = 3.7037037037037095;
        sa[107] = 3.8461538461538494;
        sa[108] = 3.4482758620689653;
        sa[109] = 3.4482758620689653;
        sa[110] = 3.7037037037037095;
        sa[111] = 3.5714285714285796;
        sa[112] = 3.4482758620689653;
        sa[113] = 3.5714285714285796;
        sa[114] = 3.7037037037036975;
        sa[115] = 3.8461538461538494;
        sa[116] = 3.571428571428568;
        sa[117] = 3.5714285714285796;
        sa[118] = 3.571428571428568;
        sa[119] = 3.846153846153836;
        sa[120] = 3.846153846153836;
        sa[121] = 3.571428571428568;
        sa[122] = 4.0;
        sa[123] = 3.8461538461538494;
        sa[124] = 3.8461538461538494;
        sa[125] = 4.0;
        sa[126] = 4.3478260869565135;
        sa[127] = 4.54545454545455;
        sa[128] = 4.1666666666666785;
        sa[129] = 4.3478260869565135;
        sa[130] = 1.515151515151515;
        sa[131] = 1.0204081632653066;
        sa[132] = 1.4084507042253522;
        sa[133] = 2.0833333333333353;
        sa[134] = 2.272727272727275;
        sa[135] = 1.8518518518518516;
        sa[136] = 0.9615384615384615;
        sa[137] = 1.515151515151515;
        sa[138] = 1.1235955056179778;
        sa[139] = 0.8695652173913041;
        sa[140] = 0.8130081300813006;
        sa[141] = 0.5235602094240838;
        sa[142] = 0.49751243781094523;
        sa[143] = 0.4219409282700421;
        sa[144] = 0.3508771929824561;
        sa[145] = 0.3289473684210526;
        sa[146] = 0.3623188405797102;
        sa[147] = 0.33003300330033003;
        sa[148] = 0.27932960893854747;
        sa[149] = 0.27855153203342614;
        sa[150] = 0.2717391304347826;
        sa[151] = 0.2688172043010753;
        sa[152] = 0.2967359050445104;
        sa[153] = 0.3105590062111801;
        sa[154] = 0.3134796238244514;
        sa[155] = 0.32051282051282054;
        sa[156] = 0.326797385620915;
        sa[157] = 0.2808988764044944;
        sa[158] = 0.25641025641025644;
        sa[159] = 0.25839793281653745;
        sa[160] = 0.267379679144385;
        sa[161] = 0.2906976744186046;
        sa[162] = 0.2985074626865672;
        sa[163] = 0.2695417789757412;
        sa[164] = 0.25062656641604014;
        sa[165] = 0.25125628140703515;
        sa[166] = 0.2617801047120419;
        sa[167] = 0.26881720430107525;
        sa[168] = 0.2617801047120419;
        sa[169] = 0.2688172043010752;
        sa[170] = 0.29411764705882354;
        sa[171] = 0.30581039755351686;
        sa[172] = 0.31055900621118016;
        sa[173] = 0.29069767441860467;
        sa[174] = 0.2604166666666667;
        sa[175] = 0.25252525252525254;
        sa[176] = 0.26455026455026454;
        sa[177] = 0.26109660574412535;
        sa[178] = 0.25839793281653745;
        sa[179] = 0.25641025641025644;
        sa[180] = 0.2518891687657431;
        sa[181] = 0.25000000000000006;
        sa[182] = 0.24752475247524752;
        sa[183] = 0.24630541871921185;
        sa[184] = 0.24390243902439027;
        sa[185] = 0.24449877750611249;
        sa[186] = 0.24213075060532682;
        sa[187] = 0.24096385542168672;
        sa[188] = 0.23696682464454977;
        sa[189] = 0.2347417840375587;
        sa[190] = 0.23255813953488372;
        sa[191] = 0.2320185614849188;
        sa[192] = 0.2298850574712644;
        sa[193] = 0.22779043280182235;
        sa[194] = 0.2252252252252252;
        sa[195] = 0.2242152466367713;
        sa[196] = 0.22271714922048996;
        sa[197] = 0.22271714922048996;
        sa[198] = 0.22123893805309736;
        sa[199] = 0.21978021978021978;
        sa[200] = 0.2178649237472767;
        sa[201] = 0.2173913043478261;
        sa[202] = 0.21645021645021645;
        sa[203] = 0.21505376344086025;
        sa[204] = 0.21186440677966104;
        sa[205] = 0.21008403361344538;
        sa[206] = 0.20920502092050208;
        sa[207] = 0.20746887966804978;
        sa[208] = 0.20703933747412007;
        sa[209] = 0.20703933747412007;
      }
    }
  }
  static class NORMSUB implements java.io.Serializable {
    public static final double[] VALUES = new double[210];
    static {
      NORMSUB_0.fill(VALUES);
    }
    static final class NORMSUB_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = 4.8415;
        sa[1] = 4.9085;
        sa[2] = 4.964499999999999;
        sa[3] = 5.022;
        sa[4] = 5.0775;
        sa[5] = 5.137;
        sa[6] = 5.210000000000001;
        sa[7] = 5.287999999999999;
        sa[8] = 5.3685;
        sa[9] = 5.4555;
        sa[10] = 5.534;
        sa[11] = 5.6434999999999995;
        sa[12] = 5.747999999999999;
        sa[13] = 5.846500000000001;
        sa[14] = 5.9445;
        sa[15] = 6.019;
        sa[16] = 6.1065000000000005;
        sa[17] = 6.1770000000000005;
        sa[18] = 6.2355;
        sa[19] = 6.2829999999999995;
        sa[20] = 6.3134999999999994;
        sa[21] = 6.3465;
        sa[22] = 6.3675;
        sa[23] = 6.3795;
        sa[24] = 6.382;
        sa[25] = 6.379;
        sa[26] = 6.380999999999999;
        sa[27] = 6.3765;
        sa[28] = 6.367;
        sa[29] = 6.3605;
        sa[30] = 6.350499999999999;
        sa[31] = 6.340000000000001;
        sa[32] = 6.3260000000000005;
        sa[33] = 6.3145;
        sa[34] = 6.298;
        sa[35] = 6.2829999999999995;
        sa[36] = 6.2675;
        sa[37] = 6.247999999999999;
        sa[38] = 6.2305;
        sa[39] = 6.209999999999999;
        sa[40] = 6.188000000000001;
        sa[41] = 6.167999999999999;
        sa[42] = 6.1450000000000005;
        sa[43] = 6.12;
        sa[44] = 6.0975;
        sa[45] = 6.0755;
        sa[46] = 6.0475;
        sa[47] = 6.0225;
        sa[48] = 5.9990000000000006;
        sa[49] = 5.9765;
        sa[50] = 5.954;
        sa[51] = 5.9270000000000005;
        sa[52] = 5.901;
        sa[53] = 5.8765;
        sa[54] = 5.858500000000001;
        sa[55] = 5.8345;
        sa[56] = 5.808;
        sa[57] = 5.7780000000000005;
        sa[58] = 5.754;
        sa[59] = 5.7235;
        sa[60] = 5.697;
        sa[61] = 5.669;
        sa[62] = 5.638999999999999;
        sa[63] = 5.609;
        sa[64] = 5.5805;
        sa[65] = 5.5520000000000005;
        sa[66] = 5.518;
        sa[67] = 5.488999999999999;
        sa[68] = 5.456;
        sa[69] = 5.430000000000001;
        sa[70] = 5.407000000000001;
        sa[71] = 5.3765;
        sa[72] = 5.3515;
        sa[73] = 5.3295;
        sa[74] = 5.3075;
        sa[75] = 5.288500000000001;
        sa[76] = 5.2695;
        sa[77] = 5.2509999999999994;
        sa[78] = 5.234;
        sa[79] = 5.221;
        sa[80] = 5.2065;
        sa[81] = 5.1935;
        sa[82] = 5.183999999999999;
        sa[83] = 5.1739999999999995;
        sa[84] = 5.165;
        sa[85] = 5.1555;
        sa[86] = 5.1485;
        sa[87] = 5.14;
        sa[88] = 5.133;
        sa[89] = 5.128;
        sa[90] = 5.121499999999999;
        sa[91] = 5.116999999999999;
        sa[92] = 5.112;
        sa[93] = 5.1045;
        sa[94] = 5.103;
        sa[95] = 5.0954999999999995;
        sa[96] = 5.0954999999999995;
        sa[97] = 5.09;
        sa[98] = 5.089;
        sa[99] = 5.083500000000001;
        sa[100] = 5.0775;
        sa[101] = 5.0785;
        sa[102] = 5.076;
        sa[103] = 5.0755;
        sa[104] = 5.071;
        sa[105] = 5.0705;
        sa[106] = 5.0675;
        sa[107] = 5.063;
        sa[108] = 5.062;
        sa[109] = 5.0585;
        sa[110] = 5.055000000000001;
        sa[111] = 5.0515;
        sa[112] = 5.0465;
        sa[113] = 5.0455;
        sa[114] = 5.0425;
        sa[115] = 5.04;
        sa[116] = 5.0375;
        sa[117] = 5.037;
        sa[118] = 5.032500000000001;
        sa[119] = 5.0295000000000005;
        sa[120] = 5.0265;
        sa[121] = 5.0235;
        sa[122] = 5.022499999999999;
        sa[123] = 5.0155;
        sa[124] = 5.015000000000001;
        sa[125] = 5.0120000000000005;
        sa[126] = 5.0105;
        sa[127] = 5.0035;
        sa[128] = 5.002;
        sa[129] = 5.008;
        sa[130] = 5.026000000000001;
        sa[131] = 5.039;
        sa[132] = 5.026;
        sa[133] = 5.0120000000000005;
        sa[134] = 5.024;
        sa[135] = 5.026999999999999;
        sa[136] = 5.05;
        sa[137] = 5.036999999999999;
        sa[138] = 5.05;
        sa[139] = 5.054;
        sa[140] = 5.038;
        sa[141] = 5.022499999999999;
        sa[142] = 4.9965;
        sa[143] = 4.9745;
        sa[144] = 4.9455;
        sa[145] = 4.911;
        sa[146] = 4.857499999999999;
        sa[147] = 4.8575;
        sa[148] = 4.8635;
        sa[149] = 4.8149999999999995;
        sa[150] = 4.769;
        sa[151] = 4.6975;
        sa[152] = 4.6195;
        sa[153] = 4.544;
        sa[154] = 4.482;
        sa[155] = 4.4275;
        sa[156] = 4.3695;
        sa[157] = 4.3385;
        sa[158] = 4.313999999999999;
        sa[159] = 4.2555;
        sa[160] = 4.171;
        sa[161] = 4.106;
        sa[162] = 4.0695;
        sa[163] = 4.067;
        sa[164] = 4.074000000000001;
        sa[165] = 4.1015;
        sa[166] = 4.0755;
        sa[167] = 4.0455;
        sa[168] = 4.016500000000001;
        sa[169] = 3.9795000000000003;
        sa[170] = 3.937;
        sa[171] = 3.914;
        sa[172] = 3.893;
        sa[173] = 3.8930000000000007;
        sa[174] = 3.904500000000001;
        sa[175] = 3.9010000000000007;
        sa[176] = 3.8599999999999994;
        sa[177] = 3.8455;
        sa[178] = 3.8389999999999995;
        sa[179] = 3.8409999999999997;
        sa[180] = 3.8465000000000003;
        sa[181] = 3.8950000000000005;
        sa[182] = 3.9545000000000003;
        sa[183] = 3.9975;
        sa[184] = 4.035;
        sa[185] = 4.101000000000001;
        sa[186] = 4.156000000000001;
        sa[187] = 4.229;
        sa[188] = 4.3175;
        sa[189] = 4.346;
        sa[190] = 4.3365;
        sa[191] = 4.358;
        sa[192] = 4.385;
        sa[193] = 4.411499999999999;
        sa[194] = 4.4345;
        sa[195] = 4.453;
        sa[196] = 4.4595;
        sa[197] = 4.461499999999999;
        sa[198] = 4.468999999999999;
        sa[199] = 4.489;
        sa[200] = 4.5135;
        sa[201] = 4.557;
        sa[202] = 4.6;
        sa[203] = 4.652;
        sa[204] = 4.7045;
        sa[205] = 4.7635;
        sa[206] = 4.8345;
        sa[207] = 4.8965000000000005;
        sa[208] = 4.9615;
        sa[209] = 5.0275;
      }
    }
  }
  // Offset into the workspace for categorical variables.
  public static final int[] CATOFFSETS = {0};
  // Number of neurons for each layer.
  public static final int[] NEURONS = {210,50,20,50,210};
  public int getPredsSize() { return 210; }
  public boolean isAutoEncoder() { return true; }
  public String getHeader() { return "reconstr_C1,reconstr_C2,reconstr_C3,reconstr_C4,reconstr_C5,reconstr_C6,reconstr_C7,reconstr_C8,reconstr_C9,reconstr_C10,reconstr_C11,reconstr_C12,reconstr_C13,reconstr_C14,reconstr_C15,reconstr_C16,reconstr_C17,reconstr_C18,reconstr_C19,reconstr_C20,reconstr_C21,reconstr_C22,reconstr_C23,reconstr_C24,reconstr_C25,reconstr_C26,reconstr_C27,reconstr_C28,reconstr_C29,reconstr_C30,reconstr_C31,reconstr_C