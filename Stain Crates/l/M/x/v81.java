package l.M.x;

import java.util.List;

public class v81 {
   // $FF: synthetic field
   public String v;
   // $FF: synthetic field
   public int _v;
   // $FF: synthetic field
   public List<String> _;
   // $FF: synthetic field
   private static int S;
   // $FF: synthetic field
   private static final int e;

   // $FF: synthetic method
   public void v(v_5 var1) {
      String var10001 = this.v;
      int var10002 = this._v;
      String[] var10003;
      if (this._ == null) {
         var10003 = null;
         if (S >= 0) {
            throw null;
         }
      } else {
         var10003 = (String[])this._.toArray(new String[e]);
      }

      var1.v(var10001, var10002, var10003);
   }

   // $FF: synthetic method
   public v81(String var1, int var2, List<String> var3) {
      this.v = var1;
      this._v = var2;
      this._ = var3;
   }

   static {
      int var10002 = U.o(529712110);
      int var10001 = -1432827083;
      e = (var10002 ^ 2009287160) & -1;
   }
}
