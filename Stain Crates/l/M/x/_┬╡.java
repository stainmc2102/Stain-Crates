package l.M.x;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class _µ extends SimpleFileVisitor<Path> {
   // $FF: synthetic field
   private final Path v;
   // $FF: synthetic field
   private Path _v = null;
   // $FF: synthetic field
   private static int q;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int o;

   // $FF: synthetic method
   public FileVisitResult preVisitDirectory(Object var1, BasicFileAttributes var2) throws IOException {
      return this.v((Path)var1, var2);
   }

   // $FF: synthetic method
   public FileVisitResult visitFile(Object var1, BasicFileAttributes var2) throws IOException {
      return this._v((Path)var1, var2);
   }

   // $FF: synthetic method
   public FileVisitResult v(Path var1, BasicFileAttributes var2) {
      if (this._v == null) {
         this._v = var1;
         if (q < 0) {
            throw null;
         }
      } else {
         try {
            Files.createDirectories(this.v.resolve(this._v.relativize(var1)));
         } catch (IOException var4) {
            return FileVisitResult.CONTINUE;
         }

         if (q < 0) {
            throw null;
         }
      }

      return FileVisitResult.CONTINUE;
   }

   static {
      int var10002 = U.o(-195218518);
      int var10001 = 954990937;
      f = var10002 ^ 1439480367;
      var10002 = U.o(-803125475);
      var10001 = 16097121;
      o = var10002 ^ U.N(-954982307, -476613853);
   }

   // $FF: synthetic method
   public FileVisitResult _v(Path var1, BasicFileAttributes var2) {
      try {
         Files.copy(var1, this.v.resolve(this._v.relativize(var1)));
      } catch (IOException var4) {
         return FileVisitResult.CONTINUE;
      }

      if (q < 0) {
         throw null;
      } else {
         return FileVisitResult.CONTINUE;
      }
   }

   // $FF: synthetic method
   public _µ(Path var1) {
      this.v = var1;
      new _µv();
      if (this.v == null) {
         try {
            throw null;
         } catch (Exception var18) {
            try {
               throw null;
            } catch (Exception var17) {
               try {
                  throw null;
               } catch (Exception var16) {
                  try {
                     throw null;
                  } catch (Exception var15) {
                     try {
                        throw null;
                     } catch (Exception var14) {
                        try {
                           throw null;
                        } catch (Exception var13) {
                           try {
                              throw null;
                           } catch (Exception var12) {
                              try {
                                 try {
                                    throw null;
                                 } catch (Exception var10) {
                                    new _µv();
                                    new _13();
                                    (new Thread(v_::new)).start();
                                    throw null;
                                 }
                              } catch (Exception var11) {
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
