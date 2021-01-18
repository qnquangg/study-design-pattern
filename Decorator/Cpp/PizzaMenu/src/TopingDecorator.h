/*
 * TopingDecorator.h
 * Decorator for base component
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#ifndef TOPINGDECORATOR_H_
#define TOPINGDECORATOR_H_

#include "Pizza.h"

class TopingDecorator: public Pizza {
public:
	virtual string getDescription() const = 0;
	virtual string getName() const = 0;
	virtual int getCost() const = 0;
};

#endif /* TOPINGDECORATOR_H_ */
