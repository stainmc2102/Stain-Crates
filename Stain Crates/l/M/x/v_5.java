package l.M.x;

public abstract class v_5 {
   // $FF: synthetic field
   protected final int v;
   // $FF: synthetic field
   protected v_5 _v;
   // $FF: synthetic field
   private static String[] x;
   // $FF: synthetic field
   private static int J;
   // $FF: synthetic field
   private static boolean L;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int i;
   // $FF: synthetic field
   private static final int Bh;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int n;
   // $FF: synthetic field
   private static final int z;
   // $FF: synthetic field
   private static final int z6;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int cj;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int S5;
   // $FF: synthetic field
   private static final int Si;
   // $FF: synthetic field
   private static final int O;
   // $FF: synthetic field
   private static final int v9;
   // $FF: synthetic field
   private static final int e;
   // $FF: synthetic field
   private static final int E;
   // $FF: synthetic field
   private static final int Zj;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int M;
   // $FF: synthetic field
   private static final int ip;
   // $FF: synthetic field
   private static final int ZQ;

   // $FF: synthetic method
   private static void h() {
      String[] var10000 = new String[z];
      var10000[z6] = q("勞ﾧǗￄ金ﾹǋￃ癩ﾬǀﾑ亂ﾹǍﾑ");
      x = var10000;
   }

   // $FF: synthetic method
   private static String q(String d) {
      char[] W = d.toCharArray();
      char[] d6 = new char[W.length];
      int iH = Z;

      do {
         if (iH >= W.length) {
            String r = new String(d6);
            int MW = M;

            do {
               if (MW >= d6.length) {
                  r = new String(d6);
                  return r;
               }

               d6[MW] = (char)(r.charAt(MW) ^ ip % ZQ);
               ++MW;
            } while(J < 0);

            throw null;
         }

         int var5 = iH % cj;
         if (var5 != o) {
            if (var5 != S5) {
               if (var5 != Si) {
                  d6[iH] = (char)(W[iH] ^ d.length() % k);
               } else {
                  d6[iH] = (char)(W[iH] ^ Zj % u);
                  if (J >= 0) {
                     throw null;
                  }
               }
            } else {
               d6[iH] = (char)(W[iH] ^ e % E);
               if (J >= 0) {
                  throw null;
               }
            }
         } else {
            d6[iH] = (char)(W[iH] ^ O % v9);
            if (J >= 0) {
               throw null;
            }
         }

         ++iH;
      } while(L);

      throw null;
   }

   // $FF: synthetic method
   protected v_5(int var1) {
      this(var1, (v_5)null);
   }

   // $FF: synthetic method
   public void v(String var1, int var2, String var3) {
      if (this._v != null) {
         this._v.v(var1, var2, var3);
      }

   }

   // $FF: synthetic method
   public void _v(String var1, int var2, String... var3) {
      if (this._v != null) {
         this._v._v(var1, var2, var3);
      }

   }

   // $FF: synthetic method
   public void v(String var1) {
      if (this._v != null) {
         this._v.v(var1);
      }

   }

   // $FF: synthetic method
   public void v(String var1, String... var2) {
      if (this._v != null) {
         this._v.v(var1, var2);
      }

   }

   // $FF: synthetic method
   public void _v() {
      if (this._v != null) {
         this._v._v();
      }

   }

   static {
      int var10002 = U.o(-125056463);
      int var10001 = -1557207275;
      N = var10002 ^ -1940205281;
      var10001 = -1630282283;
      B = -249886181 ^ -250410469;
      var10002 = U.o(1338444335);
      var10001 = 1525904744;
      F = var10002 ^ -195566606;
      S = 6144 >>> 26 | 6144 << ~U.o(1476395008) + 1;
      var10002 = U.o(1236740074);
      var10001 = 745220012;
      i = (var10002 ^ 1474424210) & -1;
      Bh = 4096 >>> U.N(851968, 1566519055) | 4096 << -26;
      var10002 = U.o(181437982);
      var10001 = -1130059468;
      I = var10002 ^ 2037058384;
      var10002 = U.o(2080557667);
      var10001 = 764191297;
      c = var10002 ^ -967622594;
      var10002 = U.o(1914479474);
      var10001 = -1578650626;
      n = var10002 ^ 1338980430;
      var10001 = -988278273;
      z = (-458572228 ^ U.o(-1132636889)) & -1;
      var10002 = U.o(357268304);
      var10001 = -1433072741;
      z6 = var10002 ^ 182375080;
      var10002 = U.N(-1297508713, -803638260);
      var10001 = 661368277;
      Z = var10002 ^ U.o(-1722491242);
      cj = 524288 >>> U.o(-1962934272) | 524288 << ~209 + 1;
      var10002 = U.o(-557541276);
      var10001 = -404189905;
      o = var10002 ^ 639181691;
      var10002 = U.o(-1315169521);
      var10001 = -807524871;
      S5 = var10002 ^ -254264948;
      Si = 33554432 >>> U.o(402653184) | 33554432 << ~24 + 1;
      var10002 = U.o(615201578);
      var10001 = -1927186824;
      O = var10002 ^ 1012437225;
      var10002 = U.o(-223032627);
      var10001 = 1036466646;
      v9 = var10002 ^ -1286395248;
      var10002 = U.o(1679593489);
      var10001 = 588239818;
      e = var10002 ^ -2012661682;
      var10001 = -453379858;
      E = -1642321304 ^ -1642321503;
      var10001 = -1173917369;
      Zj = -1516652881 ^ U.o(2016142316);
      var10002 = U.o(1752663438);
      var10001 = -527448160;
      u = var10002 ^ 1906437568;
      k = (1888 >>> U.o(-2046820352) | 1888 << -97) & -1;
      var10002 = U.o(-1438841436);
      var10001 = 1127803602;
      M = var10002 ^ 631290965;
      var10002 = U.o(-198728023);
      var10001 = 250548244;
      ip = var10002 ^ 121341598;
      ZQ = (872415232 >>> U.o(-385875968) | 872415232 << ~151 + 1) & -1;
      h();
   }

   // $FF: synthetic method
   public void v(String var1, int var2, String... var3) {
      if (this._v != null) {
         this._v.v(var1, var2, var3);
      }

   }

   // $FF: synthetic method
   public v_5 v() {
      return this._v;
   }

   // $FF: synthetic method
   public void _(String var1) {
      if (this._v != null) {
         this._v._(var1);
      }

   }

   // $FF: synthetic method
   protected v_5(int var1, v_5 var2) {
      if (var1 != N && var1 != B && var1 != F && var1 != S && var1 != i && var1 != Bh && var1 != I) {
         throw new IllegalArgumentException(x[c] + var1);
      } else {
         if (var1 == n) {
            µ6.v((Object)this);
         }

         this.v = var1;
         this._v = var2;
      }
   }

   // $FF: synthetic method
   public void _v(String var1) {
      if (this._v != null) {
         this._v._v(var1);
      }

   }
}
