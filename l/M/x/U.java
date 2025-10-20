package l.M.x;

public final class U {
   // $FF: synthetic field
   private static final int Z = (1431655765 >>> Integer.rotateRight(8448, 812987591) | 1431655765 << ~66 + 1) & -1;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int G;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int pz;
   // $FF: synthetic field
   private static final int b;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int av;
   // $FF: synthetic field
   private static final int Z2;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int bK;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int DW;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int r;

   static {
      int var10001 = 1309768309;
      I = (-1534350418 ^ Integer.rotateRight(-337042710, 1248511062)) & -1;
      C = 64 >>> 38 | 64 << -Integer.reverse(1677721600);
      var10001 = 420156837;
      p = 1172090311 ^ 277477522;
      var10001 = -1285837254;
      G = -1972939083 ^ Integer.reverse(1638279837);
      int var10002 = Integer.reverse(623364143);
      var10001 = -590523950;
      a = var10002 ^ -200022874;
      var10001 = 1355065401;
      D = -1869030213 ^ Integer.reverse(-1657071351);
      var10002 = Integer.rotateRight(695555587, -1763339224);
      var10001 = 1636904549;
      pz = var10002 ^ 807028325;
      b = -252645136 >>> 140 | -252645136 << ~Integer.reverse(822083584) + 1;
      var10002 = Integer.reverse(-1863653571);
      var10001 = -1078301056;
      u = var10002 ^ -1125689587;
      var10001 = 1775270364;
      av = -624538168 ^ Integer.reverse(867328859);
      var10002 = Integer.reverse(-681098727);
      var10001 = -1607594447;
      Z2 = var10002 ^ -1756501532;
      f = 25165824 >>> 84 | 25165824 << ~Integer.reverse(704643072) + 1;
      var10001 = 243941169;
      bK = 173215845 ^ 173272933;
      k = (Integer.MIN_VALUE >>> 156 | Integer.MIN_VALUE << -156) & -1;
      DW = 8192 >>> 170 | 8192 << ~170 + 1;
      var10001 = -1093222148;
      H = (237378403 ^ 237429859) & -1;
      var10002 = Integer.reverse(1450855359);
      var10001 = 420319630;
      r = (var10002 ^ -36544910) & -1;
   }

   // $FF: synthetic method
   public static int o(int t) {
      t = (t & Z) << I | t >>> C & p;
      t = (t & G) << a | t >>> D & pz;
      t = (t & b) << u | t >>> av & Z2;
      t = t << f | (t & bK) << k | t >>> DW & H | t >>> r;
      return t;
   }

   // $FF: synthetic method
   public static int N(int n, int Pk) {
      return n >>> Pk | n << -Pk;
   }
}
