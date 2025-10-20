package l.M.x;

public final class µ52 {
   // $FF: synthetic field
   public static final int v = 0;
   // $FF: synthetic field
   public static final int _v = 1;
   // $FF: synthetic field
   public static final int _ = 2;
   // $FF: synthetic field
   public static final int µv8 = 3;
   // $FF: synthetic field
   private final byte[] _µv;
   // $FF: synthetic field
   private final int v_;
   // $FF: synthetic field
   private static int M;
   // $FF: synthetic field
   private static boolean Q;
   // $FF: synthetic field
   private static final int o = 16 >>> 195 | 16 << ~U.o(-1023410176) + 1;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int vn;
   // $FF: synthetic field
   private static final int E;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int e;
   // $FF: synthetic field
   private static final int x;
   // $FF: synthetic field
   private static final int s;
   // $FF: synthetic field
   private static final int m;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int os;
   // $FF: synthetic field
   private static final int V;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int z;
   // $FF: synthetic field
   private static final int my;
   // $FF: synthetic field
   private static final int q;
   // $FF: synthetic field
   private static final int h;
   // $FF: synthetic field
   private static final int qS;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int lK;
   // $FF: synthetic field
   private static final int xT;
   // $FF: synthetic field
   private static final int d;
   // $FF: synthetic field
   private static final int tO;
   // $FF: synthetic field
   private static final int se;
   // $FF: synthetic field
   private static final int A;
   // $FF: synthetic field
   private static final int g;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int r;
   // $FF: synthetic field
   private static final int g4;
   // $FF: synthetic field
   private static final int J;
   // $FF: synthetic field
   private static final int W;
   // $FF: synthetic field
   private static final int L;
   // $FF: synthetic field
   private static final int eI;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int l9;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int qr;
   // $FF: synthetic field
   private static final int zc;

   // $FF: synthetic method
   static void v(µ52 var0, _µv var1) {
      if (var0 == null) {
         var1.v(Z);
         if (M < 0) {
            throw null;
         }
      } else {
         int var2 = var0._µv[var0.v_] * qr + zc;
         var1.v(var0._µv, var0.v_, var2);
      }

   }

   // $FF: synthetic method
   public static µ52 v(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();
         _µv var2 = new _µv(var1);
         var2.v(D);
         int var3 = e;

         do {
            if (var3 >= var1) {
               var2.v[tO] = (byte)(var2._v / se);
               return new µ52(var2.v, A);
            }

            char var4 = var0.charAt(var3++);
            if (var4 == x) {
               var2.v(s, m);
               if (!Q) {
                  throw null;
               }
            } else if (var4 == l) {
               var2.v(F, os);
               if (!Q) {
                  throw null;
               }
            } else if (var4 == V) {
               var2.v(p, t);
               if (M < 0) {
                  throw null;
               }
            } else {
               if (var4 < z || var4 > my) {
                  throw new IllegalArgumentException();
               }

               int var5 = var4 - q;

               while(var3 < var1) {
                  var4 = var0.charAt(var3++);
                  if (var4 < h || var4 > qS) {
                     if (var4 != xT) {
                        throw new IllegalArgumentException();
                     }

                     if (!Q) {
                        throw null;
                     }
                     break;
                  }

                  var5 = var5 * X + var4 - lK;
                  if (!Q) {
                     throw null;
                  }
               }

               var2.v(d, var5);
               if (!Q) {
                  throw null;
               }
            }
         } while(M >= 0);

         throw null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   public int v() {
      return this._µv[this.v_];
   }

   // $FF: synthetic method
   public int _v(int var1) {
      return this._µv[this.v_ + vn * var1 + E];
   }

   // $FF: synthetic method
   public int v(int var1) {
      return this._µv[this.v_ + o * var1 + u];
   }

   static {
      int var10002 = U.N(1576109173, 540429162);
      int var10001 = -2031281853;
      u = (var10002 ^ U.o(104786616)) & -1;
      vn = 1 >>> 223 | 1 << ~U.o(-83886080) + 1;
      var10001 = 2002770197;
      E = (-971587678 ^ -971587680) & -1;
      var10002 = U.o(-750742515);
      var10001 = -1701511995;
      D = var10002 ^ -1339489589;
      var10002 = U.o(-1592789220);
      var10001 = -655223073;
      e = var10002 ^ 955248773;
      var10002 = U.o(1869355257);
      var10001 = -32054455;
      x = var10002 ^ -1625803091;
      var10002 = U.o(-201043229);
      var10001 = 1441029520;
      s = var10002 ^ -951443409;
      var10002 = U.o(2112824243);
      var10001 = -109426396;
      m = (var10002 ^ U.N(-553961709, -881386510)) & -1;
      var10002 = U.o(2024970671);
      var10001 = 1794920100;
      l = var10002 ^ -174502608;
      F = (32 >>> 229 | 32 << -229) & -1;
      var10002 = U.o(1797799667);
      var10001 = 1592069078;
      os = var10002 ^ -813951786;
      V = 704643072 >>> 56 | 704643072 << ~56 + 1;
      var10001 = -909605952;
      p = (1555733816 ^ U.o(1555651898)) & -1;
      var10002 = U.o(1264019229);
      var10001 = -1933247488;
      t = var10002 ^ -1192826158;
      var10001 = -1489325623;
      z = -1560452787 ^ -1560452739;
      my = 29884416 >>> 243 | 29884416 << ~243 + 1;
      var10002 = U.N(2050605509, 269810493);
      var10001 = -211498901;
      q = var10002 ^ U.o(-663719029);
      var10002 = U.o(1900448943);
      var10001 = -90244467;
      h = var10002 ^ -181312834;
      var10001 = -1042031340;
      qS = -2050063558 ^ -2050063613;
      X = 5 >>> 255 | 5 << ~255 + 1;
      var10001 = -1141597731;
      lK = -517675875 ^ U.o(-1255725945);
      var10002 = U.o(-1325610631);
      var10001 = 1756817689;
      xT = var10002 ^ -1634517194;
      var10002 = U.o(-1315653951);
      var10001 = -1415951715;
      d = var10002 ^ -2089997938;
      var10002 = U.o(-1265754245);
      var10001 = -248793031;
      tO = var10002 ^ -554143443;
      var10002 = U.o(53931245);
      var10001 = -1373085211;
      se = var10002 ^ -1221104446;
      var10002 = U.o(-1009883478);
      var10001 = 113821108;
      A = var10002 ^ 1432777667;
      var10001 = 1015473268;
      g = (1334917131 ^ U.N(703735553, 923797885)) & -1;
      var10002 = U.o(1552176303);
      var10001 = -668191912;
      f = var10002 ^ -181788358;
      var10002 = U.o(-955017084);
      var10001 = -247700176;
      r = (var10002 ^ 555337955) & -1;
      var10001 = -512117376;
      g4 = 1095699886 ^ U.N(1836714616, -906246445);
      var10002 = U.o(995439324);
      var10001 = 6810660;
      J = var10002 ^ 994880222;
      var10002 = U.o(-181556423);
      var10001 = -1418793294;
      W = var10002 ^ -1663716180;
      L = (-1073741802 >>> U.o(2097152000) | -1073741802 << -190) & -1;
      var10001 = -1231974960;
      eI = -94211080 ^ U.o(1808680543);
      C = 21504 >>> 9 | 21504 << ~9 + 1;
      var10002 = U.o(552617866);
      var10001 = -1518674993;
      l9 = var10002 ^ 1373769535;
      var10002 = U.o(1558779449);
      var10001 = -1429523973;
      Z = var10002 ^ -1670867142;
      var10001 = 1358479123;
      qr = 2011994977 ^ U.N(-541954675, -1463900702);
      var10002 = U.o(861738386);
      var10001 = -405472666;
      zc = var10002 ^ 1235794637;
   }

   // $FF: synthetic method
   µ52(byte[] var1, int var2) {
      this._µv = var1;
      this.v_ = var2;
   }

   // $FF: synthetic method
   public String toString() {
      int var1 = this.v();
      StringBuilder var2 = new StringBuilder(var1 * g);
      int var3 = f;

      do {
         if (var3 >= var1) {
            return var2.toString();
         }

         int var4 = this.v(var3);
         if (var4 != r) {
            if (var4 != g4) {
               if (var4 != J) {
                  if (var4 != W) {
                     throw new AssertionError();
                  }

                  var2.append(this._v(var3)).append((char)l9);
                  if (M < 0) {
                     throw null;
                  }
               } else {
                  var2.append((char)C);
                  if (!Q) {
                     throw null;
                  }
               }
            } else {
               var2.append((char)eI);
               if (M < 0) {
                  throw null;
               }
            }
         } else {
            var2.append((char)L);
            if (M < 0) {
               throw null;
            }
         }

         ++var3;
      } while(M >= 0);

      throw null;
   }
}
