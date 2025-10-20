package l.M.x;

public abstract class v {
   // $FF: synthetic field
   protected final int v;
   // $FF: synthetic field
   protected v _v;
   // $FF: synthetic field
   private static String[] G;
   // $FF: synthetic field
   private static int x;
   // $FF: synthetic field
   private static boolean K;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int GD;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int T;
   // $FF: synthetic field
   private static final int d;
   // $FF: synthetic field
   private static final int m;
   // $FF: synthetic field
   private static final int L;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int GA;
   // $FF: synthetic field
   private static final int M;
   // $FF: synthetic field
   private static final int W;
   // $FF: synthetic field
   private static final int vQ;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int Zo;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int O;
   // $FF: synthetic field
   private static final int L6;
   // $FF: synthetic field
   private static final int Da;
   // $FF: synthetic field
   private static final int o8;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int Dy;

   // $FF: synthetic method
   private static void f() {
      String[] var10000 = new String[GA];
      var10000[M] = j("F\uffd9Ƨﾴcￇƻﾳgￒư￡rￇƽ￡");
      G = var10000;
   }

   static {
      int var10002 = U.o(-600864157);
      int var10001 = 1435680976;
      l = var10002 ^ -967248837;
      var10002 = U.o(1279222481);
      var10001 = -1311521914;
      X = (var10002 ^ -1957757902) & -1;
      var10001 = 1754794964;
      GD = (1067013642 ^ U.o(1349155324)) & -1;
      var10001 = -1883728088;
      N = 1133291802 ^ U.o(1486180802);
      T = (320 >>> U.o(1811939328) | 320 << ~54 + 1) & -1;
      var10002 = U.o(878532962);
      var10001 = 1360140553;
      d = (var10002 ^ 1184807468) & -1;
      var10001 = 1946147591;
      m = 1509680805 ^ 1492248229;
      var10002 = U.o(-8632619);
      var10001 = 1581339051;
      L = var10002 ^ -1419624705;
      var10002 = U.o(-1608597268);
      var10001 = 538839302;
      D = var10002 ^ 906590213;
      GA = (Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~U.o(-83886080) + 1) & -1;
      var10002 = U.o(-197206925);
      var10001 = 413809292;
      M = (var10002 ^ -834962385) & -1;
      var10002 = U.o(982552295);
      var10001 = -46631054;
      W = var10002 ^ -412022436;
      vQ = 2 >>> U.N(191, 145865920) | 2 << ~U.N(-268435445, -812004356) + 1;
      var10002 = U.o(-189521831);
      var10001 = 262534760;
      Z = var10002 ^ -1711002321;
      var10002 = U.N(-1922374813, -1577540364);
      var10001 = 1108367927;
      Zo = var10002 ^ -1372178217;
      var10002 = U.N(-748660632, -878778252);
      var10001 = -1597789378;
      p = (var10002 ^ U.N(92704052, -1094257024)) & -1;
      var10002 = U.o(1503267729);
      var10001 = 976878238;
      C = var10002 ^ 828982595;
      o = -134217666 >>> U.o(-553648128) | -134217666 << ~251 + 1;
      var10002 = U.o(-890774495);
      var10001 = 633651921;
      I = (var10002 ^ -2076448971) & -1;
      var10001 = 1054155064;
      O = 861837527 ^ U.o(2027518668);
      var10002 = U.o(-755348226);
      var10001 = -1558336812;
      L6 = var10002 ^ -311673350;
      var10002 = U.o(72094080);
      var10001 = 908448320;
      Da = var10002 ^ 25702902;
      o8 = (989855744 >>> U.o(704643072) | 989855744 << -U.N(1073741829, 720424572)) & -1;
      var10002 = U.o(-165364922);
      var10001 = -243228790;
      c = var10002 ^ 1658659951;
      var10001 = 891892406;
      H = -1261655370 ^ U.o(-535606940);
      var10001 = -2085059964;
      Dy = -2065043634 ^ U.o(351770401);
      f();
   }

   // $FF: synthetic method
   private static String j(String Oz) {
      char[] o1 = Oz.toCharArray();
      char[] pp = new char[o1.length];
      int Tt = W;

      do {
         if (Tt >= o1.length) {
            String ss = new String(pp);
            int q = c;

            do {
               if (q >= pp.length) {
                  ss = new String(pp);
                  return ss;
               }

               pp[q] = (char)(ss.charAt(q) ^ H % Dy);
               ++q;
            } while(!K);

            throw null;
         }

         int var5 = Tt % vQ;
         if (var5 != Z) {
            if (var5 != Zo) {
               if (var5 != p) {
                  pp[Tt] = (char)(o1[Tt] ^ Oz.length() % o8);
               } else {
                  pp[Tt] = (char)(o1[Tt] ^ L6 % Da);
                  if (K) {
                     throw null;
                  }
               }
            } else {
               pp[Tt] = (char)(o1[Tt] ^ I % O);
               if (x < 0) {
                  throw null;
               }
            }
         } else {
            pp[Tt] = (char)(o1[Tt] ^ C % o);
            if (x < 0) {
               throw null;
            }
         }

         ++Tt;
      } while(x >= 0);

      throw null;
   }

   // $FF: synthetic method
   public void v(String var1, Object var2) {
      if (this._v != null) {
         this._v.v(var1, var2);
      }

   }

   // $FF: synthetic method
   public v v(String var1) {
      return this._v != null ? this._v.v(var1) : null;
   }

   // $FF: synthetic method
   protected v(int var1) {
      this(var1, (v)null);
   }

   // $FF: synthetic method
   public v v(String var1, String var2) {
      return this._v != null ? this._v.v(var1, var2) : null;
   }

   // $FF: synthetic method
   public void _v() {
      if (this._v != null) {
         this._v._v();
      }

   }

   // $FF: synthetic method
   public void v(String var1, String var2, String var3) {
      if (this._v != null) {
         this._v.v(var1, var2, var3);
      }

   }

   // $FF: synthetic method
   public v v() {
      return this._v;
   }

   // $FF: synthetic method
   protected v(int var1, v var2) {
      if (var1 != l && var1 != X && var1 != GD && var1 != N && var1 != T && var1 != d && var1 != m) {
         throw new IllegalArgumentException(G[L] + var1);
      } else {
         if (var1 == D) {
            µ6.v((Object)this);
         }

         this.v = var1;
         this._v = var2;
      }
   }
}
