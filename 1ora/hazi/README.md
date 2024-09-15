ÓRAI/HÁZI FELADAT
 
-- A bemutatott telepÍtések (java 21, git, maven, intelliJ Idea Community Edition)
-- Regisztráljunk a github-ra.
-- Idea-ban csináljunk egy nem maven, sima Java Application projektet
-- abban hozzunk létre egy ora01 csomagot, abban dolgozzunk
-- tegyünk bele egy olyan main metódust, ami kiÍr egy "körte" stringet
-- ezt tegyük verziókezeltté a github felhasználónknál, 
        lehet az Idea-ban is csinálni
-- készÍtsünk egy elágazást (branch-et)
-- szerkesszük át az körtét barack-ká
-- azt erre a másik ágra nyomjuk felhasználónknál
-- próbáljuk meg a két ágat egyesÍteni (merge)
 
nyomkövetésre példa
 
van egy rendező Java-metódusunk, 
   public static void bubbleSort() {
        int nums[] = {5, 1, 6, 2, 4, 3};
        int size = nums.length;
        int temp = 0;
 
        for (int i = 0; i < size; i++) { // %%
            for (int j = 0; j < size - 1; j++) { 
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp; // Swapping elements
                }
            }
        }
 
 
nézzük meg, mi történik, szedjük ki a programból, hogyan néz ki a nums[] tömb tartalma, amikor belépünk a // %%-kal jelölt sorba, minden alkalommal, amikor belépünk
 
Ezt a 6-hoszzú sorozatot tegyük bele egy szövegfájlba, tegyük be a github-ra, az ora01 projektbe buborekRendezesNyoma.txt néven
