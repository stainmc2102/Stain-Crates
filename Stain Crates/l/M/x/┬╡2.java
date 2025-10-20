package l.M.x;

import java.util.List;

public class µ2 {
   // $FF: synthetic field
   public String v;
   // $FF: synthetic field
   public int _v;
   // $FF: synthetic field
   public List<String> _;
   // $FF: synthetic field
   private static boolean B;
   // $FF: synthetic field
   private static final int h;

   // $FF: synthetic method
   public µ2(String var1, int var2, List<String> var3) {
      this.v = var1;
      this._v = var2;
      this._ = var3;
   }

   // $FF: synthetic method
   public void v(v_5 var1) {
      String var10001 = this.v;
      int var10002 = this._v;
      String[] var10003;
      if (this._ == null) {
         var10003 = null;
         if (!B) {
            throw null;
         }
      } else {
         var10003 = (String[])this._.toArray(new String[h]);
      }

      var1._v(var10001, var10002, var10003);
   }

   static {
      int var10002 = U.o(-977114084);
      int var10001 = -1675814513;
      h = var10002 ^ U.N(567385115, 1912696015);
   }
}
