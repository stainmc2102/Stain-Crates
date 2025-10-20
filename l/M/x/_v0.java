package l.M.x;

public final class _v0 extends IndexOutOfBoundsException {
   // $FF: synthetic field
   private static final long v = 6807380416709738314L;
   // $FF: synthetic field
   private final String _v;
   // $FF: synthetic field
   private final String _;
   // $FF: synthetic field
   private final String µv8;
   // $FF: synthetic field
   private final int _µv;
   // $FF: synthetic field
   private static String[] G;
   // $FF: synthetic field
   private static int g;
   // $FF: synthetic field
   private static boolean p;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int s;
   // $FF: synthetic field
   private static final int p2;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int J;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int g2;
   // $FF: synthetic field
   private static final int R;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int M;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int SJ;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int x;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final int Xu;

   static {
      int var10002 = U.o(-368250922);
      int var10001 = 672637347;
      B = var10002 ^ 1811361879;
      var10002 = U.o(1630182887);
      var10001 = -505479963;
      s = var10002 ^ -407284601;
      var10002 = U.o(1339108260);
      var10001 = 1300195577;
      p2 = var10002 ^ 634686448;
      var10001 = 590384955;
      f = (-663150400 ^ U.o(-1023107557)) & -1;
      var10002 = U.o(1012095319);
      var10001 = -364632775;
      X = var10002 ^ U.N(1497865555, 1062687085);
      var10002 = U.o(908545056);
      var10001 = 742198775;
      J = var10002 ^ 70444141;
      var10001 = -330888357;
      w = 733657003 ^ U.o(-1779606060);
      var10002 = U.o(-1244045704);
      var10001 = 2026947809;
      a = var10002 ^ 511351725;
      var10001 = -1850978794;
      C = -1960651822 ^ U.o(1808483537);
      var10002 = U.o(40566473);
      var10001 = -1939535829;
      g2 = var10002 ^ -1820371392;
      var10001 = -896096714;
      R = (1766742131 ^ U.o(1310356118)) & -1;
      S = 131072 >>> U.o(150994944) | 131072 << ~144 + 1;
      var10002 = U.N(2060876915, -1512904236);
      var10001 = -753393280;
      o = var10002 ^ -1060580889;
      var10002 = U.N(-1850002971, 1051505619);
      var10001 = 1057127134;
      M = (var10002 ^ 1715254760) & -1;
      var10001 = -1967620048;
      I = -721789624 ^ U.o(-1531289813);
      var10001 = 940442104;
      Z = -220113971 ^ U.o(537560911);
      var10002 = U.o(1205164737);
      var10001 = 1677153427;
      SJ = var10002 ^ 285526355;
      u = 128712704 >>> U.o(-1929379840) | 128712704 << -177;
      var10001 = -930465493;
      x = (-1942570119 ^ -1942570807) & -1;
      var10002 = U.o(503648322);
      var10001 = -728287001;
      D = var10002 ^ 1107861624;
      l = -433383131 >>> U.o(838860800) | -433383131 << ~76 + 1;
      var10001 = -217277003;
      Xu = -1945444914 ^ -1945444957;
      m();
   }

   // $FF: synthetic method
   public String _v() {
      return this._;
   }

   // $FF: synthetic method
   private static void m() {
      String[] var10000 = new String[f];
      var10000[X] = N("ɝￓƪﾡɿￒǾﾽɿ\uffd9ǾﾥɱￄƹﾬȪﾖ");
      var10000[J] = N("Ⱦ");
      var10000[w] = N("Ȱ");
      G = var10000;
   }

   // $FF: synthetic method
   public int µv8() {
      return this._µv;
   }

   // $FF: synthetic method
   public _v0(String var1, String var2, String var3, int var4) {
      super(G[B] + var1 + G[s] + var2 + G[p2] + var3);
      this._v = var1;
      this._ = var2;
      this.µv8 = var3;
      this._µv = var4;
   }

   // $FF: synthetic method
   public String v() {
      return this._v;
   }

   // $FF: synthetic method
   private static String N(String pG) {
      char[] aZ = pG.toCharArray();
      char[] Gu = new char[aZ.length];
      int Uh = a;

      do {
         if (Uh >= aZ.length) {
            String FR = new String(Gu);
            int b = D;

            do {
               if (b >= Gu.length) {
                  FR = new String(Gu);
                  return FR;
               }

               Gu[b] = (char)(FR.charAt(b) ^ l % Xu);
               ++b;
            } while(g < 0);

            throw null;
         }

         int var5 = Uh % C;
         if (var5 != g2) {
            if (var5 != R) {
               if (var5 != S) {
                  Gu[Uh] = (char)(aZ[Uh] ^ pG.length() % x);
               } else {
                  Gu[Uh] = (char)(aZ[Uh] ^ SJ % u);
                  if (!p) {
                     throw null;
                  }
               }
            } else {
               Gu[Uh] = (char)(aZ[Uh] ^ I % Z);
               if (g >= 0) {
                  throw null;
               }
            }
         } else {
            Gu[Uh] = (char)(aZ[Uh] ^ o % M);
            if (g >= 0) {
               throw null;
            }
         }

         ++Uh;
      } while(p);

      throw null;
   }

   // $FF: synthetic method
   public String _() {
      return this.µv8;
   }
}
