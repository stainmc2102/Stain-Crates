package l.M.x;

final class µ5 extends µ3v76 {
   // $FF: synthetic field
   private final _µ_63 _;
   // $FF: synthetic field
   private final int µv8;
   // $FF: synthetic field
   private final int _µv;
   // $FF: synthetic field
   private final int v_;
   // $FF: synthetic field
   private int µ8_;
   // $FF: synthetic field
   private int µ;
   // $FF: synthetic field
   private _v µ0;
   // $FF: synthetic field
   private _v µv;
   // $FF: synthetic field
   private _v v0;
   // $FF: synthetic field
   private _v µ6;
   // $FF: synthetic field
   private _ µ_4;
   // $FF: synthetic field
   private static String[] R;
   // $FF: synthetic field
   private static int n;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int J;
   // $FF: synthetic field
   private static final int G;
   // $FF: synthetic field
   private static final int y;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int GZ;
   // $FF: synthetic field
   private static final int T;
   // $FF: synthetic field
   private static final int m;
   // $FF: synthetic field
   private static final int Ja;
   // $FF: synthetic field
   private static final int h;
   // $FF: synthetic field
   private static final int K;
   // $FF: synthetic field
   private static final int d;
   // $FF: synthetic field
   private static final int Fb;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int G4;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int V;
   // $FF: synthetic field
   private static final int s;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int P;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int j;
   // $FF: synthetic field
   private static final int Kw;
   // $FF: synthetic field
   private static final int HZ;
   // $FF: synthetic field
   private static final int Bn;
   // $FF: synthetic field
   private static final int Cy;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int g4;

   // $FF: synthetic method
   int _() {
      int var1 = H;
      if (this.µ != 0) {
         this._._(R[F]);
         var1 += 8;
      }

      var1 += l.M.x._.v(this._, this.µv8, this.µ8_);
      var1 += l.M.x._v.v(this.µ0, this.µv, this.v0, this.µ6);
      if (this.µ_4 != null) {
         var1 += this.µ_4.v(this._);
      }

      return var1;
   }

   // $FF: synthetic method
   final void v(µv8 var1) {
      var1.v(this.µ_4);
   }

   // $FF: synthetic method
   public void _v() {
   }

   // $FF: synthetic method
   void v(_µv var1) {
      int var10000;
      if (this._._v() < J) {
         var10000 = G;
         if (n >= 0) {
            throw null;
         }
      } else {
         var10000 = y;
      }

      int var2 = var10000;
      if (var2 != 0) {
         var10000 = I;
         if (n >= 0) {
            throw null;
         }
      } else {
         var10000 = GZ;
      }

      int var3 = var10000;
      var1._v(this.µv8 & (var3 ^ T))._v(this._µv)._v(this.v_);
      int var4 = m;
      if (this.µ != 0) {
         ++var4;
      }

      if ((this.µv8 & Ja) != 0 && var2 != 0) {
         ++var4;
      }

      if (this.µ8_ != 0) {
         ++var4;
      }

      if ((this.µv8 & h) != 0) {
         ++var4;
      }

      if (this.µ0 != null) {
         ++var4;
      }

      if (this.µv != null) {
         ++var4;
      }

      if (this.v0 != null) {
         ++var4;
      }

      if (this.µ6 != null) {
         ++var4;
      }

      if (this.µ_4 != null) {
         var4 += this.µ_4.µv8();
      }

      var1._v(var4);
      if (this.µ != 0) {
         var1._v(this._._(R[K]))._(d)._v(this.µ);
      }

      l.M.x._.v(this._, this.µv8, this.µ8_, var1);
      l.M.x._v.v(this._, this.µ0, this.µv, this.v0, this.µ6, var1);
      if (this.µ_4 != null) {
         this.µ_4.v(this._, var1);
      }

   }

   // $FF: synthetic method
   private static String g(String k) {
      char[] U = k.toCharArray();
      char[] ZO = new char[U.length];
      int zW = G4;

      do {
         if (zW >= U.length) {
            String q = new String(ZO);
            int z2 = Cy;

            do {
               if (z2 >= ZO.length) {
                  q = new String(ZO);
                  return q;
               }

               ZO[z2] = (char)(q.charAt(z2) ^ t % g4);
               ++z2;
            } while(n < 0);

            throw null;
         }

         int var5 = zW % X;
         if (var5 != S) {
            if (var5 != V) {
               if (var5 != s) {
                  ZO[zW] = (char)(U[zW] ^ k.length() % Bn);
               } else {
                  ZO[zW] = (char)(U[zW] ^ Kw % HZ);
                  if (n >= 0) {
                     throw null;
                  }
               }
            } else {
               ZO[zW] = (char)(U[zW] ^ C % j);
               if (n >= 0) {
                  throw null;
               }
            }
         } else {
            ZO[zW] = (char)(U[zW] ^ B % P);
            if (n >= 0) {
               throw null;
            }
         }

         ++zW;
      } while(n < 0);

      throw null;
   }

   // $FF: synthetic method
   public void v(_ var1) {
      var1._v = this.µ_4;
      this.µ_4 = var1;
   }

   // $FF: synthetic method
   public v v(int var1, µ52 var2, String var3, boolean var4) {
      return var4 ? (this.v0 = l.M.x._v.v(this._, var1, var2, var3, this.v0)) : (this.µ6 = l.M.x._v.v(this._, var1, var2, var3, this.µ6));
   }

   static {
      int var10002 = U.o(-23286890);
      int var10001 = 573072140;
      Z = (var10002 ^ 1776040319) & -1;
      var10002 = U.o(-1181078784);
      var10001 = 17294915;
      H = var10002 ^ 13916565;
      var10002 = U.o(-1151298490);
      var10001 = -1277854354;
      F = var10002 ^ U.N(-609467104, -903531083);
      var10001 = -438749135;
      J = -625168966 ^ U.o(-776651429);
      var10002 = U.o(721255979);
      var10001 = 76080684;
      G = var10002 ^ -729890987;
      var10002 = U.o(1613811853);
      var10001 = 876943331;
      y = (var10002 ^ -1324676090) & -1;
      var10001 = -1937193839;
      I = -1836340555 ^ U.o(-1386360503);
      var10002 = U.o(1371579445);
      var10001 = 1414376097;
      GZ = (var10002 ^ -1406860406) & -1;
      var10002 = U.o(1726000151);
      var10001 = 1901314387;
      T = var10002 ^ 399177881;
      var10002 = U.o(327972003);
      var10001 = -287542081;
      m = var10002 ^ -986828344;
      var10002 = U.o(326556375);
      var10001 = -2141169658;
      Ja = var10002 ^ -346325304;
      var10002 = U.o(-1521092785);
      var10001 = -1728506313;
      h = var10002 ^ -219305307;
      var10001 = 1656114841;
      K = -810573479 ^ -810573480;
      d = 67108864 >>> U.o(-1660944384) | 67108864 << -185;
      var10002 = U.o(-1087646097);
      var10001 = 1136651229;
      Fb = var10002 ^ -160705281;
      var10002 = U.N(127539359, 1666280130);
      var10001 = 677251561;
      w = var10002 ^ -1041856985;
      var10002 = U.o(2064374450);
      var10001 = -1393036914;
      f = var10002 ^ 1297862879;
      var10002 = U.o(338915404);
      var10001 = 391183011;
      G4 = var10002 ^ 839830568;
      var10001 = 1492516029;
      X = -1321108272 ^ U.N(399330068, -162306068);
      var10002 = U.o(789885945);
      var10001 = -1447852392;
      S = var10002 ^ -1613944588;
      var10001 = 1285997078;
      V = 812094622 ^ U.o(-114694644);
      s = 64 >>> 197 | 64 << ~197 + 1;
      var10001 = 368609003;
      B = 1644789346 ^ 1542844766;
      var10002 = U.o(-1409344703);
      var10001 = -1728623156;
      P = (var10002 ^ -2099709942) & -1;
      C = -1811939327 >>> 122 | -1811939327 << ~122 + 1;
      j = 63504384 >>> U.o(234881024) | 63504384 << ~112 + 1;
      var10001 = 179286130;
      Kw = 1011609558 ^ U.o(-424564619);
      var10002 = U.o(340120866);
      var10001 = -1183057487;
      HZ = var10002 ^ 1152098814;
      var10002 = U.N(1570033380, -515972969);
      var10001 = 527244168;
      Bn = var10002 ^ 698206987;
      var10002 = U.o(-629296943);
      var10001 = -368211599;
      Cy = var10002 ^ -1962033573;
      var10002 = U.o(-1404663449);
      var10001 = -1842608073;
      t = var10002 ^ 1959723140;
      var10002 = U.o(1650948503);
      var10001 = 1136721836;
      g4 = var10002 ^ -375462365;
      e();
   }

   // $FF: synthetic method
   µ5(_µ_63 var1, int var2, String var3, String var4, String var5, Object var6) {
      super(Z);
      this._ = var1;
      this.µv8 = var2;
      this._µv = var1._(var3);
      this.v_ = var1._(var4);
      if (var5 != null) {
         this.µ8_ = var1._(var5);
      }

      if (var6 != null) {
         this.µ = var1.v(var6)._v0;
      }

   }

   // $FF: synthetic method
   private static void e() {
      String[] var10000 = new String[Fb];
      var10000[w] = g("ﱊￒƳﾦﱽￜƳﾡﱟￜƱﾠﱬ");
      var10000[f] = g("ﱊￒƳﾦﱽￜƳﾡﱟￜƱﾠﱬ");
      R = var10000;
   }

   // $FF: synthetic method
   public v v(String var1, boolean var2) {
      return var2 ? (this.µ0 = l.M.x._v.v(this._, var1, this.µ0)) : (this.µv = l.M.x._v.v(this._, var1, this.µv));
   }
}
