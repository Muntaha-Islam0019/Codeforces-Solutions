test_cases = int(input())

while test_cases > 0:

    burles = int(input())
    optimal = 0

    while True:

        # The main logic here is to divide the burles into small parts of burles, as, that would be optimal. If Mishka sell 10 burles, he'd get one back; if less, nothing, if higher than 10 and lower than 20 then still one. 
        partition = int(burles / 10) * 10
        optimal += partition

        # Now assigning the part he'd get back and the left one to the initial variable.
        burles_left = burles - partition
        burles = int(burles / 10) + burles_left

        # Well, if the burles are less than 10, he have no option rather than selling them all.
        if burles < 10:
            optimal += burles
            break

    print(optimal)

    test_cases -= 1
