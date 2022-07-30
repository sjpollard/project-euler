import numpy as np

def main():
    print(np.sum(np.unique(np.concatenate((np.arange(1, 334) * 3, np.arange(1, 200) * 5)))))

if __name__ == "__main__":
    main()