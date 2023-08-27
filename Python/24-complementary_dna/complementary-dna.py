""" DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA" """

def DNA_strand(dna):
    ans = ''
    for n in dna:
        if n == "A":
            ans += "T"
        elif n =="T":
            ans += "A"
        elif n == "G":
            ans += "C"
        else:
            ans += "G"
    return ans