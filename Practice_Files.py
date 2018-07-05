class AdvancedArthmetic(object):
    def divisorSum(n):
        raise NotImplementedError


class Calculator(AdvancedArthmetic):
    def divisorSum(self, n):
        sum = 1
        for i in range(2,(n+1)):
            if (n % i == 0):
                assert isinstance(sum, object)
                sum += i

        return sum


n = int(input())
my_calculator = Calculator()
s = my_calculator.divisorSum(n)
print("I implemented: " + type(my_calculator).__bases__[0].__name__)
print(s)
