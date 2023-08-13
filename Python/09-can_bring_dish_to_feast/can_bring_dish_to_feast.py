def can_bring_dish_to_feast(beast, dish):
    if ((beast[0] == dish[0]) and (beast[-1] == dish[-1])):
        return True
    else:
        return False