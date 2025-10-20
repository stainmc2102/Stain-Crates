package l.M.x;

public final class µ extends IndexOutOfBoundsException {
   // $FF: synthetic field
   private static final long v = 160715609518896765L;
   // $FF: synthetic field
   private final String _v;
   // $FF: synthetic field
   private final int _;
   // $FF: synthetic field
   private static String[] B;
   // $FF: synthetic field
   private static int A;
   // $FF: synthetic field
   private static boolean f;
   // $FF: synthetic field
   private static final int z;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int Xx;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int Bj;
   // $FF: synthetic field
   private static final int e;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int T;
   // $FF: synthetic field
   private static final int ex;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int f4;
   // $FF: synthetic field
   private static final int Tj;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int wU;

   // $FF: synthetic method
   private static void X() {
      String[] var10000 = new String[S];
      var10000[w] = y("ޭ￥ƵﾳޝﾩƠﾯށﾩƸﾡޜ￮Ʊ\ufffaߎ");
      B = var10000;
   }

   static {
      int var10002 = U.N(-742204652, 1643983033);
      int var10001 = -1593827128;
      z = var10002 ^ U.o(-1773029753);
      var10002 = U.o(-1320965142);
      var10001 = -841428741;
      S = var10002 ^ 1473626764;
      var10002 = U.N(-1844839781, 1758056124);
      var10001 = -1948303012;
      w = var10002 ^ U.N(-1684928006, -114350732);
      var10002 = U.o(-1681448278);
      var10001 = 1642624192;
      Xx = var10002 ^ 1430578137;
      var10002 = U.o(-329703011);
      var10001 = 622401690;
      D = var10002 ^ -1182492109;
      var10002 = U.N(-167232017, 2096647315);
      var10001 = -29915861;
      Bj = (var10002 ^ U.o(-2088780320)) & -1;
      e = 2097152 >>> 181 | 2097152 << ~181 + 1;
      var10001 = -1068643968;
      t = -1219676637 ^ U.o(-2073251091);
      var10002 = U.o(2029847470);
      var10001 = 1599252766;
      T = var10002 ^ U.N(-478883277, 1542814966);
      var10001 = -1200319611;
      ex = -774638332 ^ U.o(-615527541);
      var10002 = U.o(1761562166);
      var10001 = 117460354;
      u = var10002 ^ 1819475790;
      var10002 = U.N(-1793092256, 1481338138);
      var10001 = 2136904490;
      H = var10002 ^ U.o(937076706);
      a = (-1733532521 >>> 46 | -1733532521 << ~U.o(1946157056) + 1) & -1;
      var10002 = U.o(746574252);
      var10001 = 197871076;
      N = var10002 ^ 898366946;
      f4 = 59 >>> U.o(939524096) | 59 << ~28 + 1;
      var10002 = U.o(628373720);
      var10001 = 2104574941;
      Tj = var10002 ^ 454831780;
      p = (843828310 >>> 61 | 843828310 << ~61 + 1) & -1;
      var10002 = U.o(998647652);
      var10001 = -1855886400;
      wU = var10002 ^ 652501380;
      X();
   }

   // $FF: synthetic method
   public String v() {
      return this._v;
   }

   // $FF: synthetic method
   private static String y(String z2) {
      char[] tC = z2.toCharArray();
      char[] r = new char[tC.length];
      int zb = Xx;

      do {
         if (zb >= tC.length) {
            String o3 = new String(r);
            int D4 = Tj;

            do {
               if (D4 >= r.length) {
                  o3 = new String(r);
                  return o3;
               }

               r[D4] = (char)(o3.charAt(D4) ^ p % wU);
               ++D4;
            } while(A >= 0);

            throw null;
         }

         int var5 = zb % D;
         if (var5 != Bj) {
            if (var5 != e) {
               if (var5 != t) {
                  r[zb] = (char)(tC[zb] ^ z2.length() % f4);
               } else {
                  r[zb] = (char)(tC[zb] ^ a % N);
                  if (A < 0) {
                     throw null;
                  }
               }
            } else {
               r[zb] = (char)(tC[zb] ^ u % H);
               if (A < 0) {
                  throw null;
               }
            }
         } else {
            r[zb] = (char)(tC[zb] ^ T % ex);
            if (f) {
               throw null;
            }
         }

         ++zb;
      } while(!f);

      throw null;
   }

   // $FF: synthetic method
   public µ(String var1, int var2) {
      super(B[z] + var1);
      this._v = var1;
      this._ = var2;
   }

   // $FF: synthetic method
   public int _v() {
      return this._;
   }
}
