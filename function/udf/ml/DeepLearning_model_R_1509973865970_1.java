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
        sa[130] = 1