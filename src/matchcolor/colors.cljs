(ns matchcolor.colors)

(def colors [{:name "Acid Green", :r 176, :g 191, :b 26}
             {:name "Aero", :r 124, :g 185, :b 232}
             {:name "Aero Blue", :r 201, :g 255, :b 229}
             {:name "African Violet", :r 178, :g 132, :b 190}
             {:name "Air Force Blue (RAF)", :r 93, :g 138, :b 168}
             {:name "Air Force Blue (USAF)", :r 0, :g 48, :b 143}
             {:name "Air Superiority Blue", :r 114, :g 160, :b 193}
             {:name "Alabama Crimson", :r 175, :g 0, :b 42}
             {:name "Alice Blue", :r 240, :g 248, :b 255}
             {:name "Alizarin Crimson", :r 227, :g 38, :b 54}
             {:name "Alloy Orange", :r 196, :g 98, :b 16}
             {:name "Almond", :r 239, :g 222, :b 205}
             {:name "Amaranth", :r 229, :g 43, :b 80}
             {:name "Amaranth Pink", :r 241, :g 156, :b 187}
             {:name "Amaranth Purple", :r 171, :g 39, :b 79}
             {:name "Amazon", :r 59, :g 122, :b 87}
             {:name "Amber", :r 255, :g 191, :b 0}
             {:name "Amber (SAE/ECE)", :r 255, :g 126, :b 0}
             {:name "American Rose", :r 255, :g 3, :b 62}
             {:name "Amethyst", :r 153, :g 102, :b 204}
             {:name "Android Green", :r 164, :g 198, :b 57}
             {:name "Anti-Flash White", :r 242, :g 243, :b 244}
             {:name "Antique Brass", :r 205, :g 149, :b 117}
             {:name "Antique Bronze", :r 102, :g 93, :b 30}
             {:name "Antique Fuchsia", :r 145, :g 92, :b 131}
             {:name "Antique Ruby", :r 132, :g 27, :b 45}
             {:name "Antique White", :r 250, :g 235, :b 215}
             {:name "Ao (English)", :r 0, :g 128, :b 0}
             {:name "Apple Green", :r 141, :g 182, :b 0}
             {:name "Apricot", :r 251, :g 206, :b 177}
             {:name "Aqua", :r 0, :g 255, :b 255}
             {:name "Aquamarine", :r 127, :g 255, :b 212}
             {:name "Army Green", :r 75, :g 83, :b 32}
             {:name "Arsenic", :r 59, :g 68, :b 75}
             {:name "Artichoke", :r 143, :g 151, :b 121}
             {:name "Arylide Yellow", :r 233, :g 214, :b 107}
             {:name "Ash Grey", :r 178, :g 190, :b 181}
             {:name "Asparagus", :r 135, :g 169, :b 107}
             {:name "Atomic Tangerine", :r 255, :g 153, :b 102}
             {:name "Auburn", :r 165, :g 42, :b 42}
             {:name "Aureolin", :r 253, :g 238, :b 0}
             {:name "AuroMetalSaurus", :r 110, :g 127, :b 128}
             {:name "Avocado", :r 86, :g 130, :b 3}
             {:name "Azure", :r 0, :g 127, :b 255}
             {:name "Azure (Web Color)", :r 240, :g 255, :b 255}
             {:name "Azure Mist", :r 240, :g 255, :b 255}
             {:name "B'dazzled Blue", :r 46, :g 88, :b 148}
             {:name "Baby Blue", :r 137, :g 207, :b 240}
             {:name "Baby Blue Eyes", :r 161, :g 202, :b 241}
             {:name "Baby Pink", :r 244, :g 194, :b 194}
             {:name "Baby Powder", :r 254, :g 254, :b 250}
             {:name "Baker-Miller Pink", :r 255, :g 145, :b 175}
             {:name "Ball Blue", :r 33, :g 171, :b 205}
             {:name "Banana Mania", :r 250, :g 231, :b 181}
             {:name "Banana Yellow", :r 255, :g 225, :b 53}
             {:name "Bangladesh Green", :r 0, :g 106, :b 78}
             {:name "Barbie Pink", :r 224, :g 33, :b 138}
             {:name "Barn Red", :r 124, :g 10, :b 2}
             {:name "Battleship Grey", :r 132, :g 132, :b 130}
             {:name "Bazaar", :r 152, :g 119, :b 123}
             {:name "Beau Blue", :r 188, :g 212, :b 230}
             {:name "Beaver", :r 159, :g 129, :b 112}
             {:name "Beige", :r 245, :g 245, :b 220}
             {:name "Big Dip O’ruby", :r 156, :g 37, :b 66}
             {:name "Bisque", :r 255, :g 228, :b 196}
             {:name "Bistre", :r 61, :g 43, :b 31}
             {:name "Bistre Brown", :r 150, :g 113, :b 23}
             {:name "Bitter Lemon", :r 202, :g 224, :b 13}
             {:name "Bitter Lime", :r 191, :g 255, :b 0}
             {:name "Bittersweet", :r 254, :g 111, :b 94}
             {:name "Bittersweet Shimmer", :r 191, :g 79, :b 81}
             {:name "Black", :r 0, :g 0, :b 0}
             {:name "Black Bean", :r 61, :g 12, :b 2}
             {:name "Black Leather Jacket", :r 37, :g 53, :b 41}
             {:name "Black Olive", :r 59, :g 60, :b 54}
             {:name "Blanched Almond", :r 255, :g 235, :b 205}
             {:name "Blast-Off Bronze", :r 165, :g 113, :b 100}
             {:name "Bleu De France", :r 49, :g 140, :b 231}
             {:name "Blizzard Blue", :r 172, :g 229, :b 238}
             {:name "Blond", :r 250, :g 240, :b 190}
             {:name "Blue", :r 0, :g 0, :b 255}
             {:name "Blue (Crayola)", :r 31, :g 117, :b 254}
             {:name "Blue (Munsell)", :r 0, :g 147, :b 175}
             {:name "Blue (NCS)", :r 0, :g 135, :b 189}
             {:name "Blue (Pantone)", :r 0, :g 24, :b 168}
             {:name "Blue (Pigment)", :r 51, :g 51, :b 153}
             {:name "Blue (RYB)", :r 2, :g 71, :b 254}
             {:name "Blue Bell", :r 162, :g 162, :b 208}
             {:name "Blue Sapphire", :r 18, :g 97, :b 128}
             {:name "Blue Yonder", :r 80, :g 114, :b 167}
             {:name "Blue-Gray", :r 102, :g 153, :b 204}
             {:name "Blue-Green", :r 13, :g 152, :b 186}
             {:name "Blue-Violet", :r 138, :g 43, :b 226}
             {:name "Blueberry", :r 79, :g 134, :b 247}
             {:name "Bluebonnet", :r 28, :g 28, :b 240}
             {:name "Blush", :r 222, :g 93, :b 131}
             {:name "Bole", :r 121, :g 68, :b 59}
             {:name "Bondi Blue", :r 0, :g 149, :b 182}
             {:name "Bone", :r 227, :g 218, :b 201}
             {:name "Boston University Red", :r 204, :g 0, :b 0}
             {:name "Bottle Green", :r 0, :g 106, :b 78}
             {:name "Boysenberry", :r 135, :g 50, :b 96}
             {:name "Brandeis Blue", :r 0, :g 112, :b 255}
             {:name "Brass", :r 181, :g 166, :b 66}
             {:name "Brick Red", :r 203, :g 65, :b 84}
             {:name "Bright Cerulean", :r 29, :g 172, :b 214}
             {:name "Bright Green", :r 102, :g 255, :b 0}
             {:name "Bright Lavender", :r 191, :g 148, :b 228}
             {:name "Bright Lilac", :r 216, :g 145, :b 239}
             {:name "Bright Maroon", :r 195, :g 33, :b 72}
             {:name "Bright Navy Blue", :r 25, :g 116, :b 210}
             {:name "Bright Pink", :r 255, :g 0, :b 127}
             {:name "Bright Turquoise", :r 8, :g 232, :b 222}
             {:name "Bright Ube", :r 209, :g 159, :b 232}
             {:name "Brilliant Lavender", :r 244, :g 187, :b 255}
             {:name "Brilliant Rose", :r 255, :g 85, :b 163}
             {:name "Brink Pink", :r 251, :g 96, :b 127}
             {:name "British Racing Green", :r 0, :g 66, :b 37}
             {:name "Bronze", :r 205, :g 127, :b 50}
             {:name "Bronze Yellow", :r 115, :g 112, :b 0}
             {:name "Brown (Traditional)", :r 150, :g 75, :b 0}
             {:name "Brown (Web)", :r 165, :g 42, :b 42}
             {:name "Brown-Nose", :r 107, :g 68, :b 35}
             {:name "Brunswick Green", :r 27, :g 77, :b 62}
             {:name "Bubble Gum", :r 255, :g 193, :b 204}
             {:name "Bubbles", :r 231, :g 254, :b 255}
             {:name "Bud Green", :r 123, :g 182, :b 97}
             {:name "Buff", :r 240, :g 220, :b 130}
             {:name "Bulgarian Rose", :r 72, :g 6, :b 7}
             {:name "Burgundy", :r 128, :g 0, :b 32}
             {:name "Burlywood", :r 222, :g 184, :b 135}
             {:name "Burnt Orange", :r 204, :g 85, :b 0}
             {:name "Burnt Sienna", :r 233, :g 116, :b 81}
             {:name "Burnt Umber", :r 138, :g 51, :b 36}
             {:name "Byzantine", :r 189, :g 51, :b 164}
             {:name "Byzantium", :r 112, :g 41, :b 99}
             {:name "Cadet", :r 83, :g 104, :b 114}
             {:name "Cadet Blue", :r 95, :g 158, :b 160}
             {:name "Cadet Grey", :r 145, :g 163, :b 176}
             {:name "Cadmium Green", :r 0, :g 107, :b 60}
             {:name "Cadmium Orange", :r 237, :g 135, :b 45}
             {:name "Cadmium Red", :r 227, :g 0, :b 34}
             {:name "Cadmium Yellow", :r 255, :g 246, :b 0}
             {:name "Café Au Lait", :r 166, :g 123, :b 91}
             {:name "Café Noir", :r 75, :g 54, :b 33}
             {:name "Cal Poly Pomona Green", :r 30, :g 77, :b 43}
             {:name "Cambridge Blue", :r 163, :g 193, :b 173}
             {:name "Camel", :r 193, :g 154, :b 107}
             {:name "Cameo Pink", :r 239, :g 187, :b 204}
             {:name "Camouflage Green", :r 120, :g 134, :b 107}
             {:name "Canary Yellow", :r 255, :g 239, :b 0}
             {:name "Candy Apple Red", :r 255, :g 8, :b 0}
             {:name "Candy Pink", :r 228, :g 113, :b 122}
             {:name "Capri", :r 0, :g 191, :b 255}
             {:name "Caput Mortuum", :r 89, :g 39, :b 32}
             {:name "Cardinal", :r 196, :g 30, :b 58}
             {:name "Caribbean Green", :r 0, :g 204, :b 153}
             {:name "Carmine", :r 150, :g 0, :b 24}
             {:name "Carmine (M&P)", :r 215, :g 0, :b 64}
             {:name "Carmine Pink", :r 235, :g 76, :b 66}
             {:name "Carmine Red", :r 255, :g 0, :b 56}
             {:name "Carnation Pink", :r 255, :g 166, :b 201}
             {:name "Carnelian", :r 179, :g 27, :b 27}
             {:name "Carolina Blue", :r 86, :g 160, :b 211}
             {:name "Carrot Orange", :r 237, :g 145, :b 33}
             {:name "Castleton Green", :r 0, :g 86, :b 63}
             {:name "Catalina Blue", :r 6, :g 42, :b 120}
             {:name "Catawba", :r 112, :g 54, :b 66}
             {:name "Cedar Chest", :r 201, :g 90, :b 73}
             {:name "Ceil", :r 146, :g 161, :b 207}
             {:name "Celadon", :r 172, :g 225, :b 175}
             {:name "Celadon Blue", :r 0, :g 123, :b 167}
             {:name "Celadon Green", :r 47, :g 132, :b 124}
             {:name "Celeste", :r 178, :g 255, :b 255}
             {:name "Celestial Blue", :r 73, :g 151, :b 208}
             {:name "Cerise", :r 222, :g 49, :b 99}
             {:name "Cerise Pink", :r 236, :g 59, :b 131}
             {:name "Cerulean", :r 0, :g 123, :b 167}
             {:name "Cerulean Blue", :r 42, :g 82, :b 190}
             {:name "Cerulean Frost", :r 109, :g 155, :b 195}
             {:name "CG Blue", :r 0, :g 122, :b 165}
             {:name "CG Red", :r 224, :g 60, :b 49}
             {:name "Chamoisee", :r 160, :g 120, :b 90}
             {:name "Champagne", :r 247, :g 231, :b 206}
             {:name "Charcoal", :r 54, :g 69, :b 79}
             {:name "Charleston Green", :r 35, :g 43, :b 43}
             {:name "Charm Pink", :r 230, :g 143, :b 172}
             {:name "Chartreuse (Traditional)", :r 223, :g 255, :b 0}
             {:name "Chartreuse (Web)", :r 127, :g 255, :b 0}
             {:name "Cherry", :r 222, :g 49, :b 99}
             {:name "Cherry Blossom Pink", :r 255, :g 183, :b 197}
             {:name "Chestnut", :r 149, :g 69, :b 53}
             {:name "China Pink", :r 222, :g 111, :b 161}
             {:name "China Rose", :r 168, :g 81, :b 110}
             {:name "Chinese Red", :r 170, :g 56, :b 30}
             {:name "Chinese Violet", :r 133, :g 96, :b 136}
             {:name "Chocolate (Traditional)", :r 123, :g 63, :b 0}
             {:name "Chocolate (Web)", :r 210, :g 105, :b 30}
             {:name "Chrome Yellow", :r 255, :g 167, :b 0}
             {:name "Cinereous", :r 152, :g 129, :b 123}
             {:name "Cinnabar", :r 227, :g 66, :b 52}
             {:name "Cinnamon[Citation Needed]", :r 210, :g 105, :b 30}
             {:name "Citrine", :r 228, :g 208, :b 10}
             {:name "Citron", :r 159, :g 169, :b 31}
             {:name "Claret", :r 127, :g 23, :b 52}
             {:name "Classic Rose", :r 251, :g 204, :b 231}
             {:name "Cobalt", :r 0, :g 71, :b 171}
             {:name "Cocoa Brown", :r 210, :g 105, :b 30}
             {:name "Coconut", :r 150, :g 90, :b 62}
             {:name "Coffee", :r 111, :g 78, :b 55}
             {:name "Columbia Blue", :r 196, :g 216, :b 226}
             {:name "Congo Pink", :r 248, :g 131, :b 121}
             {:name "Cool Black", :r 0, :g 0, :b 0}
             {:name "Cool Grey", :r 140, :g 146, :b 172}
             {:name "Copper", :r 184, :g 115, :b 51}
             {:name "Copper (Crayola)", :r 218, :g 138, :b 103}
             {:name "Copper Penny", :r 173, :g 111, :b 105}
             {:name "Copper Red", :r 203, :g 109, :b 81}
             {:name "Copper Rose", :r 153, :g 102, :b 102}
             {:name "Coquelicot", :r 255, :g 56, :b 0}
             {:name "Coral", :r 255, :g 127, :b 80}
             {:name "Coral Pink", :r 248, :g 131, :b 121}
             {:name "Coral Red", :r 255, :g 64, :b 64}
             {:name "Cordovan", :r 137, :g 63, :b 69}
             {:name "Corn", :r 251, :g 236, :b 93}
             {:name "Cornell Red", :r 179, :g 27, :b 27}
             {:name "Cornflower Blue", :r 100, :g 149, :b 237}
             {:name "Cornsilk", :r 255, :g 248, :b 220}
             {:name "Cosmic Latte", :r 255, :g 248, :b 231}
             {:name "Cotton Candy", :r 255, :g 188, :b 217}
             {:name "Cream", :r 255, :g 253, :b 208}
             {:name "Crimson", :r 220, :g 20, :b 60}
             {:name "Crimson Glory", :r 190, :g 0, :b 50}
             {:name "Cyan", :r 0, :g 255, :b 255}
             {:name "Cyan (Process)", :r 0, :g 183, :b 235}
             {:name "Cyber Grape", :r 88, :g 66, :b 124}
             {:name "Cyber Yellow", :r 255, :g 211, :b 0}
             {:name "Daffodil", :r 255, :g 255, :b 49}
             {:name "Dandelion", :r 240, :g 225, :b 48}
             {:name "Dark Blue", :r 0, :g 0, :b 139}
             {:name "Dark Blue-Gray", :r 102, :g 102, :b 153}
             {:name "Dark Brown", :r 101, :g 67, :b 33}
             {:name "Dark Byzantium", :r 93, :g 57, :b 84}
             {:name "Dark Candy Apple Red", :r 164, :g 0, :b 0}
             {:name "Dark Cerulean", :r 8, :g 69, :b 126}
             {:name "Dark Chestnut", :r 152, :g 105, :b 96}
             {:name "Dark Coral", :r 205, :g 91, :b 69}
             {:name "Dark Cyan", :r 0, :g 139, :b 139}
             {:name "Dark Electric Blue", :r 83, :g 104, :b 120}
             {:name "Dark Goldenrod", :r 184, :g 134, :b 11}
             {:name "Dark Gray (X11)", :r 169, :g 169, :b 169}
             {:name "Dark Green", :r 1, :g 50, :b 32}
             {:name "Dark Green (X11)", :r 0, :g 100, :b 0}
             {:name "Dark Imperial Blue", :r 0, :g 65, :b 106}
             {:name "Dark Jungle Green", :r 26, :g 36, :b 33}
             {:name "Dark Khaki", :r 189, :g 183, :b 107}
             {:name "Dark Lava", :r 72, :g 60, :b 50}
             {:name "Dark Lavender", :r 115, :g 79, :b 150}
             {:name "Dark Liver", :r 83, :g 75, :b 79}
             {:name "Dark Liver (Horses)", :r 84, :g 61, :b 55}
             {:name "Dark Magenta", :r 139, :g 0, :b 139}
             {:name "Dark Medium Gray", :r 169, :g 169, :b 169}
             {:name "Dark Midnight Blue", :r 0, :g 51, :b 102}
             {:name "Dark Moss Green", :r 74, :g 93, :b 35}
             {:name "Dark Olive Green", :r 85, :g 107, :b 47}
             {:name "Dark Orange", :r 255, :g 140, :b 0}
             {:name "Dark Orchid", :r 153, :g 50, :b 204}
             {:name "Dark Pastel Blue", :r 119, :g 158, :b 203}
             {:name "Dark Pastel Green", :r 3, :g 192, :b 60}
             {:name "Dark Pastel Purple", :r 150, :g 111, :b 214}
             {:name "Dark Pastel Red", :r 194, :g 59, :b 34}
             {:name "Dark Pink", :r 231, :g 84, :b 128}
             {:name "Dark Powder Blue", :r 0, :g 51, :b 153}
             {:name "Dark Puce", :r 79, :g 58, :b 60}
             {:name "Dark Raspberry", :r 135, :g 38, :b 87}
             {:name "Dark Red", :r 139, :g 0, :b 0}
             {:name "Dark Salmon", :r 233, :g 150, :b 122}
             {:name "Dark Scarlet", :r 86, :g 3, :b 25}
             {:name "Dark Sea Green", :r 143, :g 188, :b 143}
             {:name "Dark Sienna", :r 60, :g 20, :b 20}
             {:name "Dark Sky Blue", :r 140, :g 190, :b 214}
             {:name "Dark Slate Blue", :r 72, :g 61, :b 139}
             {:name "Dark Slate Gray", :r 47, :g 79, :b 79}
             {:name "Dark Spring Green", :r 23, :g 114, :b 69}
             {:name "Dark Tan", :r 145, :g 129, :b 81}
             {:name "Dark Tangerine", :r 255, :g 168, :b 18}
             {:name "Dark Taupe", :r 72, :g 60, :b 50}
             {:name "Dark Terra Cotta", :r 204, :g 78, :b 92}
             {:name "Dark Turquoise", :r 0, :g 206, :b 209}
             {:name "Dark Vanilla", :r 209, :g 190, :b 168}
             {:name "Dark Violet", :r 148, :g 0, :b 211}
             {:name "Dark Yellow", :r 155, :g 135, :b 12}
             {:name "Dartmouth Green", :r 0, :g 112, :b 60}
             {:name "Davy's Grey", :r 85, :g 85, :b 85}
             {:name "Debian Red", :r 215, :g 10, :b 83}
             {:name "Deep Carmine", :r 169, :g 32, :b 62}
             {:name "Deep Carmine Pink", :r 239, :g 48, :b 56}
             {:name "Deep Carrot Orange", :r 233, :g 105, :b 44}
             {:name "Deep Cerise", :r 218, :g 50, :b 135}
             {:name "Deep Champagne", :r 250, :g 214, :b 165}
             {:name "Deep Chestnut", :r 185, :g 78, :b 72}
             {:name "Deep Coffee", :r 112, :g 66, :b 65}
             {:name "Deep Fuchsia", :r 193, :g 84, :b 193}
             {:name "Deep Jungle Green", :r 0, :g 75, :b 73}
             {:name "Deep Lemon", :r 245, :g 199, :b 26}
             {:name "Deep Lilac", :r 153, :g 85, :b 187}
             {:name "Deep Magenta", :r 204, :g 0, :b 204}
             {:name "Deep Mauve", :r 212, :g 115, :b 212}
             {:name "Deep Moss Green", :r 53, :g 94, :b 59}
             {:name "Deep Peach", :r 255, :g 203, :b 164}
             {:name "Deep Pink", :r 255, :g 20, :b 147}
             {:name "Deep Puce", :r 169, :g 92, :b 104}
             {:name "Deep Ruby", :r 132, :g 63, :b 91}
             {:name "Deep Saffron", :r 255, :g 153, :b 51}
             {:name "Deep Sky Blue", :r 0, :g 191, :b 255}
             {:name "Deep Space Sparkle", :r 74, :g 100, :b 108}
             {:name "Deep Taupe", :r 126, :g 94, :b 96}
             {:name "Deep Tuscan Red", :r 102, :g 66, :b 77}
             {:name "Deer", :r 186, :g 135, :b 89}
             {:name "Denim", :r 21, :g 96, :b 189}
             {:name "Desert", :r 193, :g 154, :b 107}
             {:name "Desert Sand", :r 237, :g 201, :b 175}
             {:name "Desire", :r 234, :g 60, :b 83}
             {:name "Diamond", :r 185, :g 242, :b 255}
             {:name "Dim Gray", :r 105, :g 105, :b 105}
             {:name "Dirt", :r 155, :g 118, :b 83}
             {:name "Dodger Blue", :r 30, :g 144, :b 255}
             {:name "Dogwood Rose", :r 215, :g 24, :b 104}
             {:name "Dollar Bill", :r 133, :g 187, :b 101}
             {:name "Donkey Brown", :r 102, :g 76, :b 40}
             {:name "Drab", :r 150, :g 113, :b 23}
             {:name "Duke Blue", :r 0, :g 0, :b 156}
             {:name "Dust Storm", :r 229, :g 204, :b 201}
             {:name "Dutch White", :r 239, :g 223, :b 187}
             {:name "Earth Yellow", :r 225, :g 169, :b 95}
             {:name "Ebony", :r 85, :g 93, :b 80}
             {:name "Ecru", :r 194, :g 178, :b 128}
             {:name "Eerie Black", :r 27, :g 27, :b 27}
             {:name "Eggplant", :r 97, :g 64, :b 81}
             {:name "Eggshell", :r 240, :g 234, :b 214}
             {:name "Egyptian Blue", :r 16, :g 52, :b 166}
             {:name "Electric Blue", :r 125, :g 249, :b 255}
             {:name "Electric Crimson", :r 255, :g 0, :b 63}
             {:name "Electric Cyan", :r 0, :g 255, :b 255}
             {:name "Electric Green", :r 0, :g 255, :b 0}
             {:name "Electric Indigo", :r 111, :g 0, :b 255}
             {:name "Electric Lavender", :r 244, :g 187, :b 255}
             {:name "Electric Lime", :r 204, :g 255, :b 0}
             {:name "Electric Purple", :r 191, :g 0, :b 255}
             {:name "Electric Ultramarine", :r 63, :g 0, :b 255}
             {:name "Electric Violet", :r 143, :g 0, :b 255}
             {:name "Electric Yellow", :r 255, :g 255, :b 51}
             {:name "Emerald", :r 80, :g 200, :b 120}
             {:name "Eminence", :r 108, :g 48, :b 130}
             {:name "English Green", :r 27, :g 77, :b 62}
             {:name "English Lavender", :r 180, :g 131, :b 149}
             {:name "English Red", :r 171, :g 75, :b 82}
             {:name "English Violet", :r 86, :g 60, :b 92}
             {:name "Eton Blue", :r 150, :g 200, :b 162}
             {:name "Eucalyptus", :r 68, :g 215, :b 168}
             {:name "Fallow", :r 193, :g 154, :b 107}
             {:name "Falu Red", :r 128, :g 24, :b 24}
             {:name "Fandango", :r 181, :g 51, :b 137}
             {:name "Fandango Pink", :r 222, :g 82, :b 133}
             {:name "Fashion Fuchsia", :r 244, :g 0, :b 161}
             {:name "Fawn", :r 229, :g 170, :b 112}
             {:name "Feldgrau", :r 77, :g 93, :b 83}
             {:name "Feldspar", :r 253, :g 213, :b 177}
             {:name "Fern Green", :r 79, :g 121, :b 66}
             {:name "Ferrari Red", :r 255, :g 40, :b 0}
             {:name "Field Drab", :r 108, :g 84, :b 30}
             {:name "Fire Engine Red", :r 206, :g 32, :b 41}
             {:name "Firebrick", :r 178, :g 34, :b 34}
             {:name "Flame", :r 226, :g 88, :b 34}
             {:name "Flamingo Pink", :r 252, :g 142, :b 172}
             {:name "Flattery", :r 107, :g 68, :b 35}
             {:name "Flavescent", :r 247, :g 233, :b 142}
             {:name "Flax", :r 238, :g 220, :b 130}
             {:name "Flirt", :r 162, :g 0, :b 109}
             {:name "Floral White", :r 255, :g 250, :b 240}
             {:name "Fluorescent Orange", :r 255, :g 191, :b 0}
             {:name "Fluorescent Pink", :r 255, :g 20, :b 147}
             {:name "Fluorescent Yellow", :r 204, :g 255, :b 0}
             {:name "Folly", :r 255, :g 0, :b 79}
             {:name "Forest Green (Traditional)", :r 1, :g 68, :b 33}
             {:name "Forest Green (Web)", :r 34, :g 139, :b 34}
             {:name "French Beige", :r 166, :g 123, :b 91}
             {:name "French Bistre", :r 133, :g 109, :b 77}
             {:name "French Blue", :r 0, :g 114, :b 187}
             {:name "French Fuchsia", :r 253, :g 63, :b 146}
             {:name "French Lilac", :r 134, :g 96, :b 142}
             {:name "French Lime", :r 158, :g 253, :b 56}
             {:name "French Mauve", :r 212, :g 115, :b 212}
             {:name "French Pink", :r 253, :g 108, :b 158}
             {:name "French Plum", :r 129, :g 20, :b 83}
             {:name "French Puce", :r 78, :g 22, :b 9}
             {:name "French Raspberry", :r 199, :g 44, :b 72}
             {:name "French Rose", :r 246, :g 74, :b 138}
             {:name "French Sky Blue", :r 119, :g 181, :b 254}
             {:name "French Violet", :r 136, :g 6, :b 206}
             {:name "French Wine", :r 172, :g 30, :b 68}
             {:name "Fresh Air", :r 166, :g 231, :b 255}
             {:name "Fuchsia", :r 255, :g 0, :b 255}
             {:name "Fuchsia (Crayola)", :r 193, :g 84, :b 193}
             {:name "Fuchsia Pink", :r 255, :g 119, :b 255}
             {:name "Fuchsia Purple", :r 204, :g 57, :b 123}
             {:name "Fuchsia Rose", :r 199, :g 67, :b 117}
             {:name "Fulvous", :r 228, :g 132, :b 0}
             {:name "Fuzzy Wuzzy", :r 204, :g 102, :b 102}
             {:name "Gainsboro", :r 220, :g 220, :b 220}
             {:name "Gamboge", :r 228, :g 155, :b 15}
             {:name "Generic Viridian", :r 0, :g 127, :b 102}
             {:name "Ghost White", :r 248, :g 248, :b 255}
             {:name "Giants Orange", :r 254, :g 90, :b 29}
             {:name "Ginger", :r 176, :g 101, :b 0}
             {:name "Glaucous", :r 96, :g 130, :b 182}
             {:name "Glitter", :r 230, :g 232, :b 250}
             {:name "GO Green", :r 0, :g 171, :b 102}
             {:name "Gold (Metallic)", :r 212, :g 175, :b 55}
             {:name "Gold (Web) (Golden)", :r 255, :g 215, :b 0}
             {:name "Gold Fusion", :r 133, :g 117, :b 78}
             {:name "Golden Brown", :r 153, :g 101, :b 21}
             {:name "Golden Poppy", :r 252, :g 194, :b 0}
             {:name "Golden Yellow", :r 255, :g 223, :b 0}
             {:name "Goldenrod", :r 218, :g 165, :b 32}
             {:name "Granny Smith Apple", :r 168, :g 228, :b 160}
             {:name "Grape", :r 111, :g 45, :b 168}
             {:name "Gray", :r 128, :g 128, :b 128}
             {:name "Gray (HTML/CSS Gray)", :r 128, :g 128, :b 128}
             {:name "Gray (X11 Gray)", :r 190, :g 190, :b 190}
             {:name "Gray-Asparagus", :r 70, :g 89, :b 69}
             {:name "Gray-Blue", :r 140, :g 146, :b 172}
             {:name "Green (Color Wheel) (X11 Green)", :r 0, :g 255, :b 0}
             {:name "Green (Crayola)", :r 28, :g 172, :b 120}
             {:name "Green (HTML/CSS Color)", :r 0, :g 128, :b 0}
             {:name "Green (Munsell)", :r 0, :g 168, :b 119}
             {:name "Green (NCS)", :r 0, :g 159, :b 107}
             {:name "Green (Pantone)", :r 0, :g 173, :b 67}
             {:name "Green (Pigment)", :r 0, :g 165, :b 80}
             {:name "Green (RYB)", :r 102, :g 176, :b 50}
             {:name "Green-Yellow", :r 173, :g 255, :b 47}
             {:name "Grullo", :r 169, :g 154, :b 134}
             {:name "Guppie Green", :r 0, :g 255, :b 127}
             {:name "Halayà Úbe", :r 102, :g 56, :b 84}
             {:name "Han Blue", :r 68, :g 108, :b 207}
             {:name "Han Purple", :r 82, :g 24, :b 250}
             {:name "Hansa Yellow", :r 233, :g 214, :b 107}
             {:name "Harlequin", :r 63, :g 255, :b 0}
             {:name "Harvard Crimson", :r 201, :g 0, :b 22}
             {:name "Harvest Gold", :r 218, :g 145, :b 0}
             {:name "Heart Gold", :r 128, :g 128, :b 0}
             {:name "Heliotrope", :r 223, :g 115, :b 255}
             {:name "Heliotrope Gray", :r 170, :g 152, :b 169}
             {:name "Hollywood Cerise", :r 244, :g 0, :b 161}
             {:name "Honeydew", :r 240, :g 255, :b 240}
             {:name "Honolulu Blue", :r 0, :g 109, :b 176}
             {:name "Hooker's Green", :r 73, :g 121, :b 107}
             {:name "Hot Magenta", :r 255, :g 29, :b 206}
             {:name "Hot Pink", :r 255, :g 105, :b 180}
             {:name "Hunter Green", :r 53, :g 94, :b 59}
             {:name "Iceberg", :r 113, :g 166, :b 210}
             {:name "Icterine", :r 252, :g 247, :b 94}
             {:name "Illuminating Emerald", :r 49, :g 145, :b 119}
             {:name "Imperial", :r 96, :g 47, :b 107}
             {:name "Imperial Blue", :r 0, :g 35, :b 149}
             {:name "Imperial Purple", :r 102, :g 2, :b 60}
             {:name "Imperial Red", :r 237, :g 41, :b 57}
             {:name "Inchworm", :r 178, :g 236, :b 93}
             {:name "Independence", :r 76, :g 81, :b 109}
             {:name "India Green", :r 19, :g 136, :b 8}
             {:name "Indian Red", :r 205, :g 92, :b 92}
             {:name "Indian Yellow", :r 227, :g 168, :b 87}
             {:name "Indigo", :r 111, :g 0, :b 255}
             {:name "Indigo Dye", :r 9, :g 31, :b 146}
             {:name "Indigo (Web)", :r 75, :g 0, :b 130}
             {:name "International Klein Blue", :r 0, :g 47, :b 167}
             {:name "International Orange (Aerospace)", :r 255, :g 79, :b 0}
             {:name "International Orange (Engineering)", :r 186, :g 22, :b 12}
             {:name "International Orange (Golden Gate Bridge)", :r 192, :g 54, :b 44}
             {:name "Iris", :r 90, :g 79, :b 207}
             {:name "Irresistible", :r 179, :g 68, :b 108}
             {:name "Isabelline", :r 244, :g 240, :b 236}
             {:name "Islamic Green", :r 0, :g 144, :b 0}
             {:name "Italian Sky Blue", :r 178, :g 255, :b 255}
             {:name "Ivory", :r 255, :g 255, :b 240}
             {:name "Jade", :r 0, :g 168, :b 107}
             {:name "Japanese Carmine", :r 157, :g 41, :b 51}
             {:name "Japanese Indigo", :r 38, :g 67, :b 72}
             {:name "Japanese Violet", :r 91, :g 50, :b 86}
             {:name "Jasmine", :r 248, :g 222, :b 126}
             {:name "Jasper", :r 215, :g 59, :b 62}
             {:name "Jazzberry Jam", :r 165, :g 11, :b 94}
             {:name "Jelly Bean", :r 218, :g 97, :b 78}
             {:name "Jet", :r 52, :g 52, :b 52}
             {:name "Jonquil", :r 244, :g 202, :b 22}
             {:name "Jordy Blue", :r 138, :g 185, :b 241}
             {:name "June Bud", :r 189, :g 218, :b 87}
             {:name "Jungle Green", :r 41, :g 171, :b 135}
             {:name "Kelly Green", :r 76, :g 187, :b 23}
             {:name "Kenyan Copper", :r 124, :g 28, :b 5}
             {:name "Keppel", :r 58, :g 176, :b 158}
             {:name "Khaki (HTML/CSS) (Khaki)", :r 195, :g 176, :b 145}
             {:name "Khaki (X11) (Light Khaki)", :r 240, :g 230, :b 140}
             {:name "Kobe", :r 136, :g 45, :b 23}
             {:name "Kobi", :r 231, :g 159, :b 196}
             {:name "Kombu Green", :r 53, :g 66, :b 48}
             {:name "KU Crimson", :r 232, :g 0, :b 13}
             {:name "La Salle Green", :r 8, :g 120, :b 48}
             {:name "Languid Lavender", :r 214, :g 202, :b 221}
             {:name "Lapis Lazuli", :r 38, :g 97, :b 156}
             {:name "Laser Lemon", :r 255, :g 255, :b 102}
             {:name "Laurel Green", :r 169, :g 186, :b 157}
             {:name "Lava", :r 207, :g 16, :b 32}
             {:name "Lavender (Floral)", :r 181, :g 126, :b 220}
             {:name "Lavender (Web)", :r 230, :g 230, :b 250}
             {:name "Lavender Blue", :r 204, :g 204, :b 255}
             {:name "Lavender Blush", :r 255, :g 240, :b 245}
             {:name "Lavender Gray", :r 196, :g 195, :b 208}
             {:name "Lavender Indigo", :r 148, :g 87, :b 235}
             {:name "Lavender Magenta", :r 238, :g 130, :b 238}
             {:name "Lavender Mist", :r 230, :g 230, :b 250}
             {:name "Lavender Pink", :r 251, :g 174, :b 210}
             {:name "Lavender Purple", :r 150, :g 123, :b 182}
             {:name "Lavender Rose", :r 251, :g 160, :b 227}
             {:name "Lawn Green", :r 124, :g 252, :b 0}
             {:name "Lemon", :r 255, :g 247, :b 0}
             {:name "Lemon Chiffon", :r 255, :g 250, :b 205}
             {:name "Lemon Curry", :r 204, :g 160, :b 29}
             {:name "Lemon Glacier", :r 253, :g 255, :b 0}
             {:name "Lemon Lime", :r 227, :g 255, :b 0}
             {:name "Lemon Meringue", :r 246, :g 234, :b 190}
             {:name "Lemon Yellow", :r 255, :g 244, :b 79}
             {:name "Licorice", :r 26, :g 17, :b 16}
             {:name "Liberty", :r 84, :g 90, :b 167}
             {:name "Light Apricot", :r 253, :g 213, :b 177}
             {:name "Light Blue", :r 173, :g 216, :b 230}
             {:name "Light Brown", :r 181, :g 101, :b 29}
             {:name "Light Carmine Pink", :r 230, :g 103, :b 113}
             {:name "Light Coral", :r 240, :g 128, :b 128}
             {:name "Light Cornflower Blue", :r 147, :g 204, :b 234}
             {:name "Light Crimson", :r 245, :g 105, :b 145}
             {:name "Light Cyan", :r 224, :g 255, :b 255}
             {:name "Light Deep Pink", :r 255, :g 92, :b 205}
             {:name "Light French Beige", :r 200, :g 173, :b 127}
             {:name "Light Fuchsia Pink", :r 249, :g 132, :b 239}
             {:name "Light Goldenrod Yellow", :r 250, :g 250, :b 210}
             {:name "Light Gray", :r 211, :g 211, :b 211}
             {:name "Light Green", :r 144, :g 238, :b 144}
             {:name "Light Hot Pink", :r 255, :g 179, :b 222}
             {:name "Light Khaki", :r 240, :g 230, :b 140}
             {:name "Light Medium Orchid", :r 211, :g 155, :b 203}
             {:name "Light Moss Green", :r 173, :g 223, :b 173}
             {:name "Light Orchid", :r 230, :g 168, :b 215}
             {:name "Light Pastel Purple", :r 177, :g 156, :b 217}
             {:name "Light Pink", :r 255, :g 182, :b 193}
             {:name "Light Red Ochre", :r 233, :g 116, :b 81}
             {:name "Light Salmon", :r 255, :g 160, :b 122}
             {:name "Light Salmon Pink", :r 255, :g 153, :b 153}
             {:name "Light Sea Green", :r 32, :g 178, :b 170}
             {:name "Light Sky Blue", :r 135, :g 206, :b 250}
             {:name "Light Slate Gray", :r 119, :g 136, :b 153}
             {:name "Light Steel Blue", :r 176, :g 196, :b 222}
             {:name "Light Taupe", :r 179, :g 139, :b 109}
             {:name "Light Thulian Pink", :r 230, :g 143, :b 172}
             {:name "Light Yellow", :r 255, :g 255, :b 224}
             {:name "Lilac", :r 200, :g 162, :b 200}
             {:name "Lime (Color Wheel)", :r 191, :g 255, :b 0}
             {:name "Lime (Web) (X11 Green)", :r 0, :g 255, :b 0}
             {:name "Lime Green", :r 50, :g 205, :b 50}
             {:name "Limerick", :r 157, :g 194, :b 9}
             {:name "Lincoln Green", :r 25, :g 89, :b 5}
             {:name "Linen", :r 250, :g 240, :b 230}
             {:name "Lion", :r 193, :g 154, :b 107}
             {:name "Liseran Purple", :r 222, :g 111, :b 161}
             {:name "Little Boy Blue", :r 108, :g 160, :b 220}
             {:name "Liver", :r 103, :g 76, :b 71}
             {:name "Liver (Dogs)", :r 184, :g 109, :b 41}
             {:name "Liver (Organ)", :r 108, :g 46, :b 31}
             {:name "Liver Chestnut", :r 152, :g 116, :b 86}
             {:name "Livid", :r 102, :g 153, :b 204}
             {:name "Lumber", :r 255, :g 228, :b 205}
             {:name "Lust", :r 230, :g 32, :b 32}
             {:name "Magenta", :r 255, :g 0, :b 255}
             {:name "Magenta (Crayola)", :r 255, :g 85, :b 163}
             {:name "Magenta (Dye)", :r 202, :g 31, :b 123}
             {:name "Magenta (Pantone)", :r 208, :g 65, :b 126}
             {:name "Magenta (Process)", :r 255, :g 0, :b 144}
             {:name "Magenta Haze", :r 159, :g 69, :b 118}
             {:name "Magic Mint", :r 170, :g 240, :b 209}
             {:name "Magnolia", :r 248, :g 244, :b 255}
             {:name "Mahogany", :r 192, :g 64, :b 0}
             {:name "Maize", :r 251, :g 236, :b 93}
             {:name "Majorelle Blue", :r 96, :g 80, :b 220}
             {:name "Malachite", :r 11, :g 218, :b 81}
             {:name "Manatee", :r 151, :g 154, :b 170}
             {:name "Mango Tango", :r 255, :g 130, :b 67}
             {:name "Mantis", :r 116, :g 195, :b 101}
             {:name "Mardi Gras", :r 136, :g 0, :b 133}
             {:name "Maroon (Crayola)", :r 195, :g 33, :b 72}
             {:name "Maroon (HTML/CSS)", :r 128, :g 0, :b 0}
             {:name "Maroon (X11)", :r 176, :g 48, :b 96}
             {:name "Mauve", :r 224, :g 176, :b 255}
             {:name "Mauve Taupe", :r 145, :g 95, :b 109}
             {:name "Mauvelous", :r 239, :g 152, :b 170}
             {:name "May Green", :r 76, :g 145, :b 65}
             {:name "Maya Blue", :r 115, :g 194, :b 251}
             {:name "Meat Brown", :r 229, :g 183, :b 59}
             {:name "Medium Aquamarine", :r 102, :g 221, :b 170}
             {:name "Medium Blue", :r 0, :g 0, :b 205}
             {:name "Medium Candy Apple Red", :r 226, :g 6, :b 44}
             {:name "Medium Carmine", :r 175, :g 64, :b 53}
             {:name "Medium Champagne", :r 243, :g 229, :b 171}
             {:name "Medium Electric Blue", :r 3, :g 80, :b 150}
             {:name "Medium Jungle Green", :r 28, :g 53, :b 45}
             {:name "Medium Lavender Magenta", :r 221, :g 160, :b 221}
             {:name "Medium Orchid", :r 186, :g 85, :b 211}
             {:name "Medium Persian Blue", :r 0, :g 103, :b 165}
             {:name "Medium Purple", :r 147, :g 112, :b 219}
             {:name "Medium Red-Violet", :r 187, :g 51, :b 133}
             {:name "Medium Ruby", :r 170, :g 64, :b 105}
             {:name "Medium Sea Green", :r 60, :g 179, :b 113}
             {:name "Medium Sky Blue", :r 128, :g 218, :b 235}
             {:name "Medium Slate Blue", :r 123, :g 104, :b 238}
             {:name "Medium Spring Bud", :r 201, :g 220, :b 135}
             {:name "Medium Spring Green", :r 0, :g 250, :b 154}
             {:name "Medium Taupe", :r 103, :g 76, :b 71}
             {:name "Medium Turquoise", :r 72, :g 209, :b 204}
             {:name "Medium Tuscan Red", :r 121, :g 68, :b 59}
             {:name "Medium Vermilion", :r 217, :g 96, :b 59}
             {:name "Medium Violet-Red", :r 199, :g 21, :b 133}
             {:name "Mellow Apricot", :r 248, :g 184, :b 120}
             {:name "Mellow Yellow", :r 248, :g 222, :b 126}
             {:name "Melon", :r 253, :g 188, :b 180}
             {:name "Metallic Seaweed", :r 10, :g 126, :b 140}
             {:name "Metallic Sunburst", :r 156, :g 124, :b 56}
             {:name "Mexican Pink", :r 228, :g 0, :b 124}
             {:name "Midnight Blue", :r 25, :g 25, :b 112}
             {:name "Midnight Green (Eagle Green)", :r 0, :g 73, :b 83}
             {:name "Mikado Yellow", :r 255, :g 196, :b 12}
             {:name "Mindaro", :r 227, :g 249, :b 136}
             {:name "Mint", :r 62, :g 180, :b 137}
             {:name "Mint Cream", :r 245, :g 255, :b 250}
             {:name "Mint Green", :r 152, :g 255, :b 152}
             {:name "Misty Rose", :r 255, :g 228, :b 225}
             {:name "Moccasin", :r 250, :g 235, :b 215}
             {:name "Mode Beige", :r 150, :g 113, :b 23}
             {:name "Moonstone Blue", :r 115, :g 169, :b 194}
             {:name "Mordant Red 19", :r 174, :g 12, :b 0}
             {:name "Moss Green", :r 138, :g 154, :b 91}
             {:name "Mountain Meadow", :r 48, :g 186, :b 143}
             {:name "Mountbatten Pink", :r 153, :g 122, :b 141}
             {:name "MSU Green", :r 24, :g 69, :b 59}
             {:name "Mughal Green", :r 48, :g 96, :b 48}
             {:name "Mulberry", :r 197, :g 75, :b 140}
             {:name "Mustard", :r 255, :g 219, :b 88}
             {:name "Myrtle Green", :r 49, :g 120, :b 115}
             {:name "Nadeshiko Pink", :r 246, :g 173, :b 198}
             {:name "Napier Green", :r 42, :g 128, :b 0}
             {:name "Naples Yellow", :r 250, :g 218, :b 94}
             {:name "Navajo White", :r 255, :g 222, :b 173}
             {:name "Navy", :r 0, :g 0, :b 128}
             {:name "Navy Purple", :r 148, :g 87, :b 235}
             {:name "Neon Carrot", :r 255, :g 163, :b 67}
             {:name "Neon Fuchsia", :r 254, :g 65, :b 100}
             {:name "Neon Green", :r 57, :g 255, :b 20}
             {:name "New Car", :r 33, :g 79, :b 198}
             {:name "New York Pink", :r 215, :g 131, :b 127}
             {:name "Non-Photo Blue", :r 164, :g 221, :b 237}
             {:name "North Texas Green", :r 5, :g 144, :b 51}
             {:name "Nyanza", :r 233, :g 255, :b 219}
             {:name "Ocean Boat Blue", :r 0, :g 119, :b 190}
             {:name "Ochre", :r 204, :g 119, :b 34}
             {:name "Office Green", :r 0, :g 128, :b 0}
             {:name "Old Burgundy", :r 67, :g 48, :b 46}
             {:name "Old Gold", :r 207, :g 181, :b 59}
             {:name "Old Heliotrope", :r 86, :g 60, :b 92}
             {:name "Old Lace", :r 253, :g 245, :b 230}
             {:name "Old Lavender", :r 121, :g 104, :b 120}
             {:name "Old Mauve", :r 103, :g 49, :b 71}
             {:name "Old Moss Green", :r 134, :g 126, :b 54}
             {:name "Old Rose", :r 192, :g 128, :b 129}
             {:name "Old Silver", :r 132, :g 132, :b 130}
             {:name "Olive", :r 128, :g 128, :b 0}
             {:name "Olive Drab (#3)", :r 107, :g 142, :b 35}
             {:name "Olive Drab #7", :r 60, :g 52, :b 31}
             {:name "Olivine", :r 154, :g 185, :b 115}
             {:name "Onyx", :r 53, :g 56, :b 57}
             {:name "Opera Mauve", :r 183, :g 132, :b 167}
             {:name "Orange (Color Wheel)", :r 255, :g 127, :b 0}
             {:name "Orange (Crayola)", :r 255, :g 117, :b 56}
             {:name "Orange (Pantone)", :r 255, :g 88, :b 0}
             {:name "Orange (RYB)", :r 251, :g 153, :b 2}
             {:name "Orange (Web)", :r 255, :g 165, :b 0}
             {:name "Orange Peel", :r 255, :g 159, :b 0}
             {:name "Orange-Red", :r 255, :g 69, :b 0}
             {:name "Orchid", :r 218, :g 112, :b 214}
             {:name "Orchid Pink", :r 242, :g 189, :b 205}
             {:name "Orioles Orange", :r 251, :g 79, :b 20}
             {:name "Otter Brown", :r 101, :g 67, :b 33}
             {:name "Outer Space", :r 65, :g 74, :b 76}
             {:name "Outrageous Orange", :r 255, :g 110, :b 74}
             {:name "Oxford Blue", :r 0, :g 33, :b 71}
             {:name "OU Crimson Red", :r 153, :g 0, :b 0}
             {:name "Pakistan Green", :r 0, :g 102, :b 0}
             {:name "Palatinate Blue", :r 39, :g 59, :b 226}
             {:name "Palatinate Purple", :r 104, :g 40, :b 96}
             {:name "Pale Aqua", :r 188, :g 212, :b 230}
             {:name "Pale Blue", :r 175, :g 238, :b 238}
             {:name "Pale Brown", :r 152, :g 118, :b 84}
             {:name "Pale Carmine", :r 175, :g 64, :b 53}
             {:name "Pale Cerulean", :r 155, :g 196, :b 226}
             {:name "Pale Chestnut", :r 221, :g 173, :b 175}
             {:name "Pale Copper", :r 218, :g 138, :b 103}
             {:name "Pale Cornflower Blue", :r 171, :g 205, :b 239}
             {:name "Pale Gold", :r 230, :g 190, :b 138}
             {:name "Pale Goldenrod", :r 238, :g 232, :b 170}
             {:name "Pale Green", :r 152, :g 251, :b 152}
             {:name "Pale Lavender", :r 220, :g 208, :b 255}
             {:name "Pale Magenta", :r 249, :g 132, :b 229}
             {:name "Pale Pink", :r 250, :g 218, :b 221}
             {:name "Pale Plum", :r 221, :g 160, :b 221}
             {:name "Pale Red-Violet", :r 219, :g 112, :b 147}
             {:name "Pale Robin Egg Blue", :r 150, :g 222, :b 209}
             {:name "Pale Silver", :r 201, :g 192, :b 187}
             {:name "Pale Spring Bud", :r 236, :g 235, :b 189}
             {:name "Pale Taupe", :r 188, :g 152, :b 126}
             {:name "Pale Turquoise", :r 175, :g 238, :b 238}
             {:name "Pale Violet-Red", :r 219, :g 112, :b 147}
             {:name "Pansy Purple", :r 120, :g 24, :b 74}
             {:name "Paolo Veronese Green", :r 0, :g 155, :b 125}
             {:name "Papaya Whip", :r 255, :g 239, :b 213}
             {:name "Paradise Pink", :r 230, :g 62, :b 98}
             {:name "Paris Green", :r 80, :g 200, :b 120}
             {:name "Pastel Blue", :r 174, :g 198, :b 207}
             {:name "Pastel Brown", :r 131, :g 105, :b 83}
             {:name "Pastel Gray", :r 207, :g 207, :b 196}
             {:name "Pastel Green", :r 119, :g 221, :b 119}
             {:name "Pastel Magenta", :r 244, :g 154, :b 194}
             {:name "Pastel Orange", :r 255, :g 179, :b 71}
             {:name "Pastel Pink", :r 222, :g 165, :b 164}
             {:name "Pastel Purple", :r 179, :g 158, :b 181}
             {:name "Pastel Red", :r 255, :g 105, :b 97}
             {:name "Pastel Violet", :r 203, :g 153, :b 201}
             {:name "Pastel Yellow", :r 253, :g 253, :b 150}
             {:name "Patriarch", :r 128, :g 0, :b 128}
             {:name "Payne's Grey", :r 83, :g 104, :b 120}
             {:name "Peach", :r 255, :g 229, :b 180}
             {:name "Peach", :r 255, :g 203, :b 164}
             {:name "Peach-Orange", :r 255, :g 204, :b 153}
             {:name "Peach Puff", :r 255, :g 218, :b 185}
             {:name "Peach-Yellow", :r 250, :g 223, :b 173}
             {:name "Pear", :r 209, :g 226, :b 49}
             {:name "Pearl", :r 234, :g 224, :b 200}
             {:name "Pearl Aqua", :r 136, :g 216, :b 192}
             {:name "Pearly Purple", :r 183, :g 104, :b 162}
             {:name "Peridot", :r 230, :g 226, :b 0}
             {:name "Periwinkle", :r 204, :g 204, :b 255}
             {:name "Persian Blue", :r 28, :g 57, :b 187}
             {:name "Persian Green", :r 0, :g 166, :b 147}
             {:name "Persian Indigo", :r 50, :g 18, :b 122}
             {:name "Persian Orange", :r 217, :g 144, :b 88}
             {:name "Persian Pink", :r 247, :g 127, :b 190}
             {:name "Persian Plum", :r 112, :g 28, :b 28}
             {:name "Persian Red", :r 204, :g 51, :b 51}
             {:name "Persian Rose", :r 254, :g 40, :b 162}
             {:name "Persimmon", :r 236, :g 88, :b 0}
             {:name "Peru", :r 205, :g 133, :b 63}
             {:name "Phlox", :r 223, :g 0, :b 255}
             {:name "Phthalo Blue", :r 0, :g 15, :b 137}
             {:name "Phthalo Green", :r 18, :g 53, :b 36}
             {:name "Picton Blue", :r 69, :g 177, :b 232}
             {:name "Pictorial Carmine", :r 195, :g 11, :b 78}
             {:name "Piggy Pink", :r 253, :g 221, :b 230}
             {:name "Pine Green", :r 1, :g 121, :b 111}
             {:name "Pineapple", :r 86, :g 60, :b 92}
             {:name "Pink", :r 255, :g 192, :b 203}
             {:name "Pink (Pantone)", :r 215, :g 72, :b 148}
             {:name "Pink Lace", :r 255, :g 221, :b 244}
             {:name "Pink Lavender", :r 216, :g 178, :b 209}
             {:name "Pink-Orange", :r 255, :g 153, :b 102}
             {:name "Pink Pearl", :r 231, :g 172, :b 207}
             {:name "Pink Sherbet", :r 247, :g 143, :b 167}
             {:name "Pistachio", :r 147, :g 197, :b 114}
             {:name "Platinum", :r 229, :g 228, :b 226}
             {:name "Plum", :r 142, :g 69, :b 133}
             {:name "Plum (Web)", :r 221, :g 160, :b 221}
             {:name "Pomp And Power", :r 134, :g 96, :b 142}
             {:name "Popstar", :r 190, :g 79, :b 98}
             {:name "Portland Orange", :r 255, :g 90, :b 54}
             {:name "Powder Blue", :r 176, :g 224, :b 230}
             {:name "Princeton Orange", :r 245, :g 128, :b 37}
             {:name "Prune", :r 112, :g 28, :b 28}
             {:name "Prussian Blue", :r 0, :g 49, :b 83}
             {:name "Psychedelic Purple", :r 223, :g 0, :b 255}
             {:name "Puce", :r 204, :g 136, :b 153}
             {:name "Puce Red", :r 114, :g 47, :b 55}
             {:name "Pullman Brown (UPS Brown)", :r 100, :g 65, :b 23}
             {:name "Pumpkin", :r 255, :g 117, :b 24}
             {:name "Purple (HTML)", :r 128, :g 0, :b 128}
             {:name "Purple (Munsell)", :r 159, :g 0, :b 197}
             {:name "Purple (X11)", :r 160, :g 32, :b 240}
             {:name "Purple Heart", :r 105, :g 53, :b 156}
             {:name "Purple Mountain Majesty", :r 150, :g 120, :b 182}
             {:name "Purple Navy", :r 78, :g 81, :b 128}
             {:name "Purple Pizzazz", :r 254, :g 78, :b 218}
             {:name "Purple Taupe", :r 80, :g 64, :b 77}
             {:name "Purpureus", :r 154, :g 78, :b 174}
             {:name "Quartz", :r 81, :g 72, :b 79}
             {:name "Queen Blue", :r 67, :g 107, :b 149}
             {:name "Queen Pink", :r 232, :g 204, :b 215}
             {:name "Quinacridone Magenta", :r 142, :g 58, :b 89}
             {:name "Rackley", :r 93, :g 138, :b 168}
             {:name "Radical Red", :r 255, :g 53, :b 94}
             {:name "Rajah", :r 251, :g 171, :b 96}
             {:name "Raspberry", :r 227, :g 11, :b 93}
             {:name "Raspberry Glace", :r 145, :g 95, :b 109}
             {:name "Raspberry Pink", :r 226, :g 80, :b 152}
             {:name "Raspberry Rose", :r 179, :g 68, :b 108}
             {:name "Raw Umber", :r 130, :g 102, :b 68}
             {:name "Razzle Dazzle Rose", :r 255, :g 51, :b 204}
             {:name "Razzmatazz", :r 227, :g 37, :b 107}
             {:name "Razzmic Berry", :r 141, :g 78, :b 133}
             {:name "Red", :r 255, :g 0, :b 0}
             {:name "Red (Crayola)", :r 238, :g 32, :b 77}
             {:name "Red (Munsell)", :r 242, :g 0, :b 60}
             {:name "Red (NCS)", :r 196, :g 2, :b 51}
             {:name "Red (Pantone)", :r 237, :g 41, :b 57}
             {:name "Red (Pigment)", :r 237, :g 28, :b 36}
             {:name "Red (RYB)", :r 254, :g 39, :b 18}
             {:name "Red-Brown", :r 165, :g 42, :b 42}
             {:name "Red Devil", :r 134, :g 1, :b 17}
             {:name "Red-Orange", :r 255, :g 83, :b 73}
             {:name "Red-Purple", :r 228, :g 0, :b 120}
             {:name "Red-Violet", :r 199, :g 21, :b 133}
             {:name "Redwood", :r 164, :g 90, :b 82}
             {:name "Regalia", :r 82, :g 45, :b 128}
             {:name "Resolution Blue", :r 0, :g 35, :b 135}
             {:name "Rhythm", :r 119, :g 118, :b 150}
             {:name "Rich Black", :r 0, :g 64, :b 64}
             {:name "Rich Brilliant Lavender", :r 241, :g 167, :b 254}
             {:name "Rich Carmine", :r 215, :g 0, :b 64}
             {:name "Rich Electric Blue", :r 8, :g 146, :b 208}
             {:name "Rich Lavender", :r 167, :g 107, :b 207}
             {:name "Rich Lilac", :r 182, :g 102, :b 210}
             {:name "Rich Maroon", :r 176, :g 48, :b 96}
             {:name "Rifle Green", :r 68, :g 76, :b 56}
             {:name "Roast Coffee", :r 112, :g 66, :b 65}
             {:name "Robin Egg Blue", :r 0, :g 204, :b 204}
             {:name "Rocket Metallic", :r 138, :g 127, :b 128}
             {:name "Roman Silver", :r 131, :g 137, :b 150}
             {:name "Rose", :r 255, :g 0, :b 127}
             {:name "Rose Bonbon", :r 249, :g 66, :b 158}
             {:name "Rose Ebony", :r 103, :g 72, :b 70}
             {:name "Rose Gold", :r 183, :g 110, :b 121}
             {:name "Rose Madder", :r 227, :g 38, :b 54}
             {:name "Rose Pink", :r 255, :g 102, :b 204}
             {:name "Rose Quartz", :r 170, :g 152, :b 169}
             {:name "Rose Red", :r 194, :g 30, :b 86}
             {:name "Rose Taupe", :r 144, :g 93, :b 93}
             {:name "Rose Vale", :r 171, :g 78, :b 82}
             {:name "Rosewood", :r 101, :g 0, :b 11}
             {:name "Rosso Corsa", :r 212, :g 0, :b 0}
             {:name "Rosy Brown", :r 188, :g 143, :b 143}
             {:name "Royal Azure", :r 0, :g 56, :b 168}
             {:name "Royal Blue", :r 0, :g 35, :b 102}
             {:name "Royal Blue", :r 65, :g 105, :b 225}
             {:name "Royal Fuchsia", :r 202, :g 44, :b 146}
             {:name "Royal Purple", :r 120, :g 81, :b 169}
             {:name "Royal Yellow", :r 250, :g 218, :b 94}
             {:name "Ruber", :r 206, :g 70, :b 118}
             {:name "Rubine Red", :r 209, :g 0, :b 86}
             {:name "Ruby", :r 224, :g 17, :b 95}
             {:name "Ruby Red", :r 155, :g 17, :b 30}
             {:name "Ruddy", :r 255, :g 0, :b 40}
             {:name "Ruddy Brown", :r 187, :g 101, :b 40}
             {:name "Ruddy Pink", :r 225, :g 142, :b 150}
             {:name "Rufous", :r 168, :g 28, :b 7}
             {:name "Russet", :r 128, :g 70, :b 27}
             {:name "Russian Green", :r 103, :g 146, :b 103}
             {:name "Russian Violet", :r 50, :g 23, :b 77}
             {:name "Rust", :r 183, :g 65, :b 14}
             {:name "Rusty Red", :r 218, :g 44, :b 67}
             {:name "Sacramento State Green", :r 0, :g 86, :b 63}
             {:name "Saddle Brown", :r 139, :g 69, :b 19}
             {:name "Safety Orange (Blaze Orange)", :r 255, :g 103, :b 0}
             {:name "Safety Yellow", :r 238, :g 210, :b 2}
             {:name "Saffron", :r 244, :g 196, :b 48}
             {:name "Sage", :r 188, :g 184, :b 138}
             {:name "St. Patrick's Blue", :r 35, :g 41, :b 122}
             {:name "Salmon", :r 250, :g 128, :b 114}
             {:name "Salmon Pink", :r 255, :g 145, :b 164}
             {:name "Sand", :r 194, :g 178, :b 128}
             {:name "Sand Dune", :r 150, :g 113, :b 23}
             {:name "Sandstorm", :r 236, :g 213, :b 64}
             {:name "Sandy Brown", :r 244, :g 164, :b 96}
             {:name "Sandy Taupe", :r 150, :g 113, :b 23}
             {:name "Sangria", :r 146, :g 0, :b 10}
             {:name "Sap Green", :r 80, :g 125, :b 42}
             {:name "Sapphire", :r 15, :g 82, :b 186}
             {:name "Sapphire Blue", :r 0, :g 103, :b 165}
             {:name "Satin Sheen Gold", :r 203, :g 161, :b 53}
             {:name "Scarlet", :r 255, :g 36, :b 0}
             {:name "Scarlet", :r 253, :g 14, :b 53}
             {:name "Schauss Pink", :r 255, :g 145, :b 175}
             {:name "School Bus Yellow", :r 255, :g 216, :b 0}
             {:name "Screamin' Green", :r 118, :g 255, :b 122}
             {:name "Sea Blue", :r 0, :g 105, :b 148}
             {:name "Sea Green", :r 46, :g 139, :b 87}
             {:name "Seal Brown", :r 50, :g 20, :b 20}
             {:name "Seashell", :r 255, :g 245, :b 238}
             {:name "Selective Yellow", :r 255, :g 186, :b 0}
             {:name "Sepia", :r 112, :g 66, :b 20}
             {:name "Shadow", :r 138, :g 121, :b 93}
             {:name "Shadow Blue", :r 119, :g 139, :b 165}
             {:name "Shampoo", :r 255, :g 207, :b 241}
             {:name "Shamrock Green", :r 0, :g 158, :b 96}
             {:name "Sheen Green", :r 143, :g 212, :b 0}
             {:name "Shimmering Blush", :r 217, :g 134, :b 149}
             {:name "Shocking Pink", :r 252, :g 15, :b 192}
             {:name "Shocking Pink (Crayola)", :r 255, :g 111, :b 255}
             {:name "Sienna", :r 136, :g 45, :b 23}
             {:name "Silver", :r 192, :g 192, :b 192}
             {:name "Silver Chalice", :r 172, :g 172, :b 172}
             {:name "Silver Lake Blue", :r 93, :g 137, :b 186}
             {:name "Silver Pink", :r 196, :g 174, :b 173}
             {:name "Silver Sand", :r 191, :g 193, :b 194}
             {:name "Sinopia", :r 203, :g 65, :b 11}
             {:name "Skobeloff", :r 0, :g 116, :b 116}
             {:name "Sky Blue", :r 135, :g 206, :b 235}
             {:name "Sky Magenta", :r 207, :g 113, :b 175}
             {:name "Slate Blue", :r 106, :g 90, :b 205}
             {:name "Slate Gray", :r 112, :g 128, :b 144}
             {:name "Smalt (Dark Powder Blue)", :r 0, :g 51, :b 153}
             {:name "Smitten", :r 200, :g 65, :b 134}
             {:name "Smoke", :r 115, :g 130, :b 118}
             {:name "Smokey Topaz", :r 147, :g 61, :b 65}
             {:name "Smoky Black", :r 16, :g 12, :b 8}
             {:name "Snow", :r 255, :g 250, :b 250}
             {:name "Soap", :r 206, :g 200, :b 239}
             {:name "Solid Pink", :r 137, :g 56, :b 67}
             {:name "Sonic Silver", :r 117, :g 117, :b 117}
             {:name "Spartan Crimson", :r 158, :g 19, :b 22}
             {:name "Space Cadet", :r 29, :g 41, :b 81}
             {:name "Spanish Bistre", :r 128, :g 117, :b 50}
             {:name "Spanish Blue", :r 0, :g 112, :b 184}
             {:name "Spanish Carmine", :r 209, :g 0, :b 71}
             {:name "Spanish Crimson", :r 229, :g 26, :b 76}
             {:name "Spanish Gray", :r 152, :g 152, :b 152}
             {:name "Spanish Green", :r 0, :g 145, :b 80}
             {:name "Spanish Orange", :r 232, :g 97, :b 0}
             {:name "Spanish Pink", :r 247, :g 191, :b 190}
             {:name "Spanish Red", :r 230, :g 0, :b 38}
             {:name "Spanish Sky Blue", :r 0, :g 255, :b 255}
             {:name "Spanish Violet", :r 76, :g 40, :b 130}
             {:name "Spanish Viridian", :r 0, :g 127, :b 92}
             {:name "Spiro Disco Ball", :r 15, :g 192, :b 252}
             {:name "Spring Bud", :r 167, :g 252, :b 0}
             {:name "Spring Green", :r 0, :g 255, :b 127}
             {:name "Star Command Blue", :r 0, :g 123, :b 184}
             {:name "Steel Blue", :r 70, :g 130, :b 180}
             {:name "Steel Pink", :r 204, :g 51, :b 204}
             {:name "Stil De Grain Yellow", :r 250, :g 218, :b 94}
             {:name "Stizza", :r 153, :g 0, :b 0}
             {:name "Stormcloud", :r 79, :g 102, :b 106}
             {:name "Straw", :r 228, :g 217, :b 111}
             {:name "Strawberry", :r 252, :g 90, :b 141}
             {:name "Sunglow", :r 255, :g 204, :b 51}
             {:name "Sunray", :r 227, :g 171, :b 87}
             {:name "Sunset", :r 250, :g 214, :b 165}
             {:name "Sunset Orange", :r 253, :g 94, :b 83}
             {:name "Super Pink", :r 207, :g 107, :b 169}
             {:name "Tan", :r 210, :g 180, :b 140}
             {:name "Tangelo", :r 249, :g 77, :b 0}
             {:name "Tangerine", :r 242, :g 133, :b 0}
             {:name "Tangerine Yellow", :r 255, :g 204, :b 0}
             {:name "Tango Pink", :r 228, :g 113, :b 122}
             {:name "Taupe", :r 72, :g 60, :b 50}
             {:name "Taupe Gray", :r 139, :g 133, :b 137}
             {:name "Tea Green", :r 208, :g 240, :b 192}
             {:name "Tea Rose", :r 248, :g 131, :b 121}
             {:name "Tea Rose", :r 244, :g 194, :b 194}
             {:name "Teal", :r 0, :g 128, :b 128}
             {:name "Teal Blue", :r 54, :g 117, :b 136}
             {:name "Teal Deer", :r 153, :g 230, :b 179}
             {:name "Teal Green", :r 0, :g 130, :b 127}
             {:name "Telemagenta", :r 207, :g 52, :b 118}
             {:name "Tenné", :r 205, :g 87, :b 0}
             {:name "Terra Cotta", :r 226, :g 114, :b 91}
             {:name "Thistle", :r 216, :g 191, :b 216}
             {:name "Thulian Pink", :r 222, :g 111, :b 161}
             {:name "Tickle Me Pink", :r 252, :g 137, :b 172}
             {:name "Tiffany Blue", :r 10, :g 186, :b 181}
             {:name "Tiger's Eye", :r 224, :g 141, :b 60}
             {:name "Timberwolf", :r 219, :g 215, :b 210}
             {:name "Titanium Yellow", :r 238, :g 230, :b 0}
             {:name "Tomato", :r 255, :g 99, :b 71}
             {:name "Toolbox", :r 116, :g 108, :b 192}
             {:name "Topaz", :r 255, :g 200, :b 124}
             {:name "Tractor Red", :r 253, :g 14, :b 53}
             {:name "Trolley Grey", :r 128, :g 128, :b 128}
             {:name "Tropical Rain Forest", :r 0, :g 117, :b 94}
             {:name "True Blue", :r 0, :g 115, :b 207}
             {:name "Tufts Blue", :r 65, :g 125, :b 193}
             {:name "Tulip", :r 255, :g 135, :b 141}
             {:name "Tumbleweed", :r 222, :g 170, :b 136}
             {:name "Turkish Rose", :r 181, :g 114, :b 129}
             {:name "Turquoise", :r 64, :g 224, :b 208}
             {:name "Turquoise Blue", :r 0, :g 255, :b 239}
             {:name "Turquoise Green", :r 160, :g 214, :b 180}
             {:name "Tuscan", :r 250, :g 214, :b 165}
             {:name "Tuscan Brown", :r 111, :g 78, :b 55}
             {:name "Tuscan Red", :r 124, :g 72, :b 72}
             {:name "Tuscan Tan", :r 166, :g 123, :b 91}
             {:name "Tuscany", :r 192, :g 153, :b 153}
             {:name "Twilight Lavender", :r 138, :g 73, :b 107}
             {:name "Tyrian Purple", :r 102, :g 2, :b 60}
             {:name "UA Blue", :r 0, :g 51, :b 170}
             {:name "UA Red", :r 217, :g 0, :b 76}
             {:name "Ube", :r 136, :g 120, :b 195}
             {:name "UCLA Blue", :r 83, :g 104, :b 149}
             {:name "UCLA Gold", :r 255, :g 179, :b 0}
             {:name "UFO Green", :r 60, :g 208, :b 112}
             {:name "Ultramarine", :r 18, :g 10, :b 143}
             {:name "Ultramarine Blue", :r 65, :g 102, :b 245}
             {:name "Ultra Pink", :r 255, :g 111, :b 255}
             {:name "Ultra Red", :r 252, :g 108, :b 133}
             {:name "Umber", :r 99, :g 81, :b 71}
             {:name "Unbleached Silk", :r 255, :g 221, :b 202}
             {:name "United Nations Blue", :r 91, :g 146, :b 229}
             {:name "University Of California Gold", :r 183, :g 135, :b 39}
             {:name "Unmellow Yellow", :r 255, :g 255, :b 102}
             {:name "UP Forest Green", :r 1, :g 68, :b 33}
             {:name "UP Maroon", :r 123, :g 17, :b 19}
             {:name "Upsdell Red", :r 174, :g 32, :b 41}
             {:name "Urobilin", :r 225, :g 173, :b 33}
             {:name "USAFA Blue", :r 0, :g 79, :b 152}
             {:name "USC Cardinal", :r 153, :g 0, :b 0}
             {:name "USC Gold", :r 255, :g 204, :b 0}
             {:name "University Of Tennessee Orange", :r 247, :g 127, :b 0}
             {:name "Utah Crimson", :r 211, :g 0, :b 63}
             {:name "Vanilla", :r 243, :g 229, :b 171}
             {:name "Vanilla Ice", :r 243, :g 143, :b 169}
             {:name "Vegas Gold", :r 197, :g 179, :b 88}
             {:name "Venetian Red", :r 200, :g 8, :b 21}
             {:name "Verdigris", :r 67, :g 179, :b 174}
             {:name "Vermilion", :r 227, :g 66, :b 52}
             {:name "Vermilion", :r 217, :g 56, :b 30}
             {:name "Veronica", :r 160, :g 32, :b 240}
             {:name "Violet", :r 143, :g 0, :b 255}
             {:name "Violet (Color Wheel)", :r 127, :g 0, :b 255}
             {:name "Violet (RYB)", :r 134, :g 1, :b 175}
             {:name "Violet (Web)", :r 238, :g 130, :b 238}
             {:name "Violet-Blue", :r 50, :g 74, :b 178}
             {:name "Violet-Red", :r 247, :g 83, :b 148}
             {:name "Viridian", :r 64, :g 130, :b 109}
             {:name "Viridian Green", :r 0, :g 150, :b 152}
             {:name "Vista Blue", :r 124, :g 158, :b 217}
             {:name "Vivid Auburn", :r 146, :g 39, :b 36}
             {:name "Vivid Burgundy", :r 159, :g 29, :b 53}
             {:name "Vivid Cerise", :r 218, :g 29, :b 129}
             {:name "Vivid Orchid", :r 204, :g 0, :b 255}
             {:name "Vivid Sky Blue", :r 0, :g 204, :b 255}
             {:name "Vivid Tangerine", :r 255, :g 160, :b 137}
             {:name "Vivid Violet", :r 159, :g 0, :b 255}
             {:name "Warm Black", :r 0, :g 66, :b 66}
             {:name "Waterspout", :r 164, :g 244, :b 249}
             {:name "Wenge", :r 100, :g 84, :b 82}
             {:name "Wheat", :r 245, :g 222, :b 179}
             {:name "White", :r 255, :g 255, :b 255}
             {:name "White Smoke", :r 245, :g 245, :b 245}
             {:name "Wild Blue Yonder", :r 162, :g 173, :b 208}
             {:name "Wild Orchid", :r 212, :g 112, :b 162}
             {:name "Wild Strawberry", :r 255, :g 67, :b 164}
             {:name "Wild Watermelon", :r 252, :g 108, :b 133}
             {:name "Willpower Orange", :r 253, :g 88, :b 0}
             {:name "Windsor Tan", :r 167, :g 85, :b 2}
             {:name "Wine", :r 114, :g 47, :b 55}
             {:name "Wine Dregs", :r 103, :g 49, :b 71}
             {:name "Wisteria", :r 201, :g 160, :b 220}
             {:name "Wood Brown", :r 193, :g 154, :b 107}
             {:name "Xanadu", :r 115, :g 134, :b 120}
             {:name "Yale Blue", :r 15, :g 77, :b 146}
             {:name "Yankees Blue", :r 28, :g 40, :b 65}
             {:name "Yellow", :r 255, :g 255, :b 0}
             {:name "Yellow (Crayola)", :r 252, :g 232, :b 131}
             {:name "Yellow (Munsell)", :r 239, :g 204, :b 0}
             {:name "Yellow (NCS)", :r 255, :g 211, :b 0}
             {:name "Yellow (Pantone)", :r 254, :g 223, :b 0}
             {:name "Yellow (Process)", :r 255, :g 239, :b 0}
             {:name "Yellow (RYB)", :r 254, :g 254, :b 51}
             {:name "Yellow-Green", :r 154, :g 205, :b 50}
             {:name "Yellow Orange", :r 255, :g 174, :b 66}
             {:name "Yellow Rose", :r 255, :g 240, :b 0}
             {:name "Zaffre", :r 0, :g 20, :b 168}
             {:name "Zinnwaldite Brown", :r 44, :g 22, :b 8}
             {:name "Zomp", :r 57, :g 167, :b 142}])
